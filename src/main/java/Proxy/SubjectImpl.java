package Proxy;

public class SubjectImpl implements Subject {

	@Override
	public void rent() {
		System.out.println("我要租房");
	}

	@Override
	public void hello(String str) {
		System.out.println("hello: "+str);
	}

}
