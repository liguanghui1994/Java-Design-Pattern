package observer;

public class PressureObserver implements Observer {

	@Override
	public void update(float temperature, float pressure) {
		System.out.println("当前压力： ");
		System.out.println("    压力："+pressure);
	}

}
