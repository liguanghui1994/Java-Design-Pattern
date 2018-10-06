package commandPattern;

/**
 * 商家提供的点灯接口，两个功能，一个开启一个关闭
 * @author liguanghui
 *
 */
public class Light {

	public void on() {
		System.out.println("电灯开启。");
	}
	
	public void off() {
		System.out.println("电灯关闭。");
	}
}
