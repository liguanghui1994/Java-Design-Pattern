package singletonPattern;

/**
 * 静态内部类单例模式: 非常完美的单例
 * 	如果不想用双重锁验证，又想简单的避免序列化和反射对单例的破解，可以采用这种方式
 *  @author guanghui
 *
 */
public class InsideClass {
	
	private static class InsideHolder{
		private final static InsideClass inside = new InsideClass();
	}
	
	public static InsideClass getInstance() {
		return InsideHolder.inside;
	}
}
