package decorator;

public class Soy extends CondimentDecorator {
	
	private Beverage beverage ;
	private String decription = "Soy";
	private double cost = 0.5; 
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " " +this.decription;
	}

	@Override
	public double cost() {
		return beverage.cost()+this.cost;
	}

}
