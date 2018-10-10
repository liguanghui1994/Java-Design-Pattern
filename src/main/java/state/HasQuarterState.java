package state;

/**
 * 已投币状态
 * @author guanghui
 *
 */
public class HasQuarterState implements State {
	GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	//已投币，不能再次投币
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}
 
	//退币，状态回到未投币状态
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	//转动曲柄，状态到销售中状态
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

	//现在还不到发糖果的时候
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
    
    public void refill() { }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
