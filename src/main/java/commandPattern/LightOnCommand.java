package commandPattern;

/**
 * 每一个电器都需要一个实际的命令类，下面这个是点灯的实际命令类
 * @author liguanghui
 *
 */
public class LightOnCommand implements Command {

	private Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}

}
