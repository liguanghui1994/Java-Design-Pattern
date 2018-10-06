package singletonPattern;

/**
 * 枚举是通过静态对象来实现的，每一个枚举值是一个很好的单例对象
 * @author guanghui
 *
 */
public enum SingletonEnum {
    
	INSTANCE("枚举单例","0");
	
	private String name;
	private String index;
	
	private SingletonEnum(String name, String index) {
		this.name = name;
		this.index = index;
	}
	
	public void play() {
		System.out.println(this.name()+this.index);
	}
}
