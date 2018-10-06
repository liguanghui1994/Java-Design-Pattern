package decoratorPattern;

/**
 * 装饰者模式：
 * 		先有一个基本对象，然后通过装饰对象对基本对象进行更改，附加新的功能
 * 		为了让基本对象有多次装饰能力（装饰过后返回的对象必须能再次进行装饰），基本对象和装饰对象必须有同一个父类。
 * @author liguanghui
 *
 */
public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage1 = new Expresso();//基础饮料Expresso
		System.out.println(beverage1.getDescription()+" $ "+beverage1.cost());
		
		Beverage beverage2 = new HouseBlend();//基础饮料HouseBlend
		beverage2 = new Mocha(beverage2);//加配料Mocha
		beverage2 = new Soy(beverage2);//加配料Soy
		System.out.println(beverage2.getDescription()+" $ " +beverage2.cost());
	}

}
