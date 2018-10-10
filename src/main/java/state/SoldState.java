package state;
/**
 * 糖果销售中的状态
 * @author guanghui
 *
 */
public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    //已经投币并到销售中状态，无法继续投币，必须等销售完
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");
	}
 
	//已经转动曲柄到销售中，无法退币
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
	}
 
	//已经转动曲柄，无法再次转动曲柄
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}
 
	//糖果分发，如果有糖果直接发放糖果，销售完成，把状态置为为投币状态
	//如果没有糖果，状态置为售罄状态
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
	
	public void refill() { }
 
	public String toString() {
		return "dispensing a gumball";
	}
}


