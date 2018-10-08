package singleton;

import java.io.Serializable;

/**
 * 前面反复提到了反射和序列化能破解单例模式，那么如何解决这个问题呢
 * 	反射： 在构造方法中抛出异常
 * 	序列化：1、不实现序列化接口
 * 		 2、重写readResolve()方法,直接返回instance对象
 * 			（这个方法是基于回调的，反序列化时，如果定义了readResolve()
 * 				则直接返回此方法指定的对象，而不需要在创建新的对象！）
 * 
 * @author guanghui
 *
 */
public class ToAvoidReflect implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private static volatile ToAvoidReflect instance = null;
	
	private ToAvoidReflect() {
		if(instance!=null) {
			throw new RuntimeException("不能通过反射构造单例对象");
		}
	}
	
	public ToAvoidReflect getInstance() {
		if(instance==null)
			synchronized (ToAvoidReflect.class) {
				if(instance==null)
					instance = new ToAvoidReflect();
			}
		return instance;
	}
	
	//重写readResolve()方法，来避免反序列化重新构建对象，直接返回原有对象
	private Object readResolve() {
		return instance;
	}
}
