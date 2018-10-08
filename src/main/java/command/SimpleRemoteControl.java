package command;

/**
 * 通用的遥控器类，需要适配所有的电器，因此都是针对命令超类编程，使用时需要传入实际的电器命令类
 * @author liguanghui
 *
 */
public class SimpleRemoteControl {

	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void buttonWasPressed() {
		command.execute();
	}
	
}
