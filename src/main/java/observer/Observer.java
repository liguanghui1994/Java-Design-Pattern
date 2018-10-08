package observer;

/**
    *  观察者接口，只需要一个通知方法即可，主题发生变动的时候调用观察者的通知方法就可以通知到观察者
 * @author guanghui
 *
 */
public interface Observer {

	public void update(float temperature, float pressure);
	
}
