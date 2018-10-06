package factoryMethod;

/**
 * 工厂方法模式：
 * 		为了解决简单工程模式存在的问题而设计的
 * 	优点：
 * 		弄很多个工厂类，每个工厂类有不同的职责，避免单个工厂类太复杂
 * 		增加实现类，再增加一个工厂类就行了，不用修改原有代码，符合开闭原则
 *  缺点：
 *  	每个工厂职责单一，导致工厂类太多，系统比较复杂
 * 
 * 
 * @author Administrator
 */
public class Client
{
	public static void main(String args[])
	{
         try
         {
         	TV tv;
         	TVFactory factory;
         	factory=(TVFactory)XMLUtil.getBean();
         	tv=factory.produceTV();
         	tv.play();
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
	}
}
