package SimpleFactory.example01;
/**
 * 简单工厂模式
 * 		具体的实现类都实现同一个接口
 * 		工厂中通过某个条件判断，返回具体的实现类对象，向上转型后的接口
 * 		在客户端中，通过接口调用方法
 * 		客户端中不知道具体的实现类是啥，相当于黑盒
 * 	缺点：
 * 		工厂类中有很多if-else判断，代码庞大，不利于维护
 * 		不满足开闭原则，新增加实现类需要修改工厂类，增加if-else判断
 * 
 * @author guanghui
 */
public class Client
{
	public static void main(String args[])
	{
         try
         {
         	TV tv;
         	String brandName=XMLUtilTV.getBrandName();
         	tv=TVFactory.produceTV(brandName);
         	tv.play();
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
	}
}
