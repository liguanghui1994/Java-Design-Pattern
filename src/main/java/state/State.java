package state;

public interface State {
 
	//投币
	public void insertQuarter();
	//退币
	public void ejectQuarter();
	//状态转换
	public void turnCrank();
	//出糖果
	public void dispense();
	
	//重新填充
	public void refill();
}
