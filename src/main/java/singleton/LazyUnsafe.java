package singleton;

/**
 * 懒汉模式：
 * 	优点：避免了饿汉式，类加载慢的问题，节约系统资源
 * 	缺点：
 * 		1、线程不安全，通过多线程可以破解
 * 		2、反射和序列化能破解唯一性
 * @author guanghui
 *
 */
public class LazyUnsafe {

	private static LazyUnsafe instance = null;
	
	private LazyUnsafe() {
		
	}
	
	public LazyUnsafe getInstance() {
		if(instance==null)
			instance = new LazyUnsafe();
		return instance;
	}
}
