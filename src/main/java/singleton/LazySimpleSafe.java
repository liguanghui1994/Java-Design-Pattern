package singleton;

/**
 * 线程安全的懒汉模式：
 * 	缺点：
 * 		1、加了锁，性能慢，每次只能获取一个对象，多个同时获取需要等待
 * 		2、反射和序列化能破解唯一性
 * @author guanghui
 *
 */
public class LazySimpleSafe {

	private static LazySimpleSafe instance = null;
	
	private LazySimpleSafe() {
		
	}
	
	public LazySimpleSafe getInstance() {
		synchronized (LazySimpleSafe.class) {
			if(instance==null)
				instance = new LazySimpleSafe();
			return instance;
		}
	}
}
