package commandPattern;

public class Test {

	public static void main(String[] args) {
		SimpleRemoteControl control = new SimpleRemoteControl();//通用遥控器类
		
		Light light = new Light();//电器接口
		Command command = new LightOnCommand(light);//电器实际命令对象
		
		control.setCommand(command);//给遥控器设置实际的命令对象
		control.buttonWasPressed();//按下遥控器，实际是在调用命令对象的excute()方法
	}
	
}
