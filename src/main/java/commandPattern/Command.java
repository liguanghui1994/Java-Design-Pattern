package commandPattern;
/**
 * 命令的超类，所有的电器命令实际类都需要实现这个超类
 * 面向接口编程，改变电器，不需要改变遥控器的方法，因为遥控器中都是针对超类进行调用
 * @author liguanghui
 *
 */
public interface Command {

	public void execute();
}
