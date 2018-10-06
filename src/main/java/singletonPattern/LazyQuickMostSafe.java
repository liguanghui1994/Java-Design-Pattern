package singletonPattern;

/**
 * 没发现其他什么缺点，唯独反射和序列化能破解唯一性
 * @author 线程安全又快速的懒汉式
 *
 */
public class LazyQuickMostSafe {

	private static volatile LazyQuickMostSafe instance = null;
	
	private LazyQuickMostSafe() {
		
	}
	
	public LazyQuickMostSafe getInstance() {
		if(instance==null)
			synchronized (LazyQuickMostSafe.class) {
				if(instance==null)
					instance = new LazyQuickMostSafe();
			}
		return instance;
	}
	
}
