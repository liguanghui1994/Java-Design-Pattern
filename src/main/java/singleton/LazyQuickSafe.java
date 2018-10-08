package singleton;

/**
 * 效率较高的懒汉加载：
 * 	优点：
 * 		考虑到锁整个方法效率太慢，可以只锁定创建对象的代码块，效率较高
 * 	缺点：
 * 		1、相对不那么线程安全。由于一个线程A创建对象需要时间稍长，另一个线程B可能也判定instance==null
 * 			从而进入代码块内等待获取锁，获取锁之后创建对象，导致A和B可能会创建出不同的对象。
 * 		2、反射和序列化能破解唯一性
 * @author guanghui
 *
 */
public class LazyQuickSafe {

	private static LazyQuickSafe instance = null;
	
	private LazyQuickSafe() {
		
	}
	
	public LazyQuickSafe getInstance() {
		if(instance==null)
			synchronized (LazySimpleSafe.class) {
				instance = new LazyQuickSafe();
			}
		return instance;
	}
}
