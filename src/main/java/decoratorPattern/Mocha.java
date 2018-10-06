package decoratorPattern;

public class Mocha extends CondimentDecorator {
	private Beverage beverage ;
	private String decription = "Mocha";
	private double cost = 0.2; 
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " " + this.decription;
	}

	@Override
	public double cost() {
		return beverage.cost()+this.cost;
	}

}
