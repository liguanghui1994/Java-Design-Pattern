package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
    *  主题的具体实现，需要用一个list来存储观察者，需要通知观察者的时候就遍历list来挨个调用观察者的更新方法
 * @author liguanghui
 *
 */
public class WeatherDataSubject implements Subject{

	private List<Observer> observers;
	private float temperature;
	private float pressure;
	
	public WeatherDataSubject(float temperature, float pressure) {
		observers = new ArrayList<>();
		this.temperature = temperature;
		this.pressure = pressure;
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		observers.forEach(e ->{
			e.update(temperature, pressure);
		});
	}

}
