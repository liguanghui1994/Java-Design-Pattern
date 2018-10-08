package observer;

public class Client {

	public static void main(String[] args) {
		Subject subject = new WeatherDataSubject(22, 300);
		CurrentObserver current = new CurrentObserver();
		PressureObserver pressure = new PressureObserver();
		subject.registerObserver(current);
		subject.registerObserver(pressure);
		subject.notifyObservers();
	}
}
