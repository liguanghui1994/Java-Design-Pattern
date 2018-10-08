package observer;

public class CurrentObserver implements Observer {

	
	@Override
	public void update(float temperature, float pressure) {
		System.out.println("当前天气： ");
		System.out.println("    温度："+temperature+" 压力："+pressure);
	}

}
