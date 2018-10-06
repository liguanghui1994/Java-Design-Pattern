package abstractFactory;

/**
 * 抽象工厂模式：
 * 		为了解决工厂方法模式的类太多的问题，而出现。
 * 	核心思想：
 * 		将一些相关的产品组成一个“产品族”，由同一个工厂来统一生产。
 * 		一个工厂提供多个方法来产生不同的实现类，减少工厂类的个数
 * 		所有工厂实现同一个抽象类或者接口
 * 	缺点：
 * 		增加产品类需要修改工厂方法
 * 		增加产品族需要修改抽象类
 * 
 * @author Administrator
 */
public class Client
{
	public static void main(String args[])
	{
         try
         {
         	EFactory factory;
         	Television tv;
         	AirConditioner ac;
         	factory=(EFactory)XMLUtil.getBean();
         	tv=factory.produceTelevision();
         	tv.play();
         	ac=factory.produceAirConditioner();
         	ac.changeTemperature();
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
	}
}
