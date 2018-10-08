package adapter;
/**
 * 实例讲解：
 * 		我需要一个vga接口，但是我 只有一个hdmi接口，
 * 		我又不想再买一个vga接口，这个时候我可以买一个转接口进行转换，让hdmi接口能作为vga接口使用
 * 		适配器为了能替换vga接口，因此必须实现vga接口或者继承vga接口的实现类
 * @author guanghui
 *
 */
public class Test {

	public static void main(String[] args) {
		VGA vga = new HDMIAdapter(new HDMIImpl());
		vga.playvga();
	}
}
