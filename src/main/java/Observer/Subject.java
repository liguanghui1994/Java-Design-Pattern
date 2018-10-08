package Observer;

/**
    *  主题接口，至少需要提供 观察者注册方法、观察者取消注册方法和通知方法
 * @author liguanghui
 *
 */
public interface Subject {

	public void registerObserver(Observer o);
	
	public void removeObserver(Observer o);
	
	public void notifyObservers();
	
}
