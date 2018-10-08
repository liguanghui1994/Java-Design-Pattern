package facade;

/**
 * 外观模式：
 * 		将一大群对象“包装”起来，简化对外提供的接口
 * 	比如：回到家需要开电灯、风扇、空调，电视机，这个过程比较繁琐，我们可以将这些功能封装在一次，只提供开和关的功能即可，简化接口
 * 		之后添加了新的家电，比如空气净化器等，只需要修改这个外观类，不需要修改各种调用方
 * @author guanghui
 *
 */
public class Client
{
	public static void main(String args[])
	{
		GeneralSwitchFacade gsf=new GeneralSwitchFacade();
		gsf.on();
		System.out.println("-----------------------");	
		gsf.off();
	}
}