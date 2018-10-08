package singleton;

/**
 * 饿汉模式：
 * 	优点：
 * 		线程安全
 * 		在调用的时候不需要创建对象和进行逻辑判断，速度快
 * 	缺点：
 * 		1、反射和序列化能破解唯一性
 * 		2、类初始化的时候就要创建对象，增加类加载的时间，不利于系统资源的利用
 * @author guanghui
 *
 */
public class Hungry {

	private static final Hungry instance = new Hungry();
	//构造方法标为私有的，不让外部通过new来创建对象，保障对象的唯一性
	private Hungry() {
		
	}
	
	//通过公共的方法来提供构造好的对象
	public Hungry getInstance() {
		return instance;
	}
}
