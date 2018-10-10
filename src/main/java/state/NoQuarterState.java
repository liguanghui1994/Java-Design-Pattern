package state;

/**
 * 未投币状态
 * @author guanghui
 *
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    //投币之后，状态改为已投币
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
 
	//还未投币，因此不能退币
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}
 
	//转动曲柄，未投币，不能发放糖果
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	 }
 
	//未投币，不能发放糖果
	public void dispense() {
		System.out.println("You need to pay first");
	} 
	
	public void refill() { }
 
	public String toString() {
		return "waiting for quarter";
	}
}
