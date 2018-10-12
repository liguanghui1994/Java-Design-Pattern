package Proxy;

import java.lang.reflect.Proxy;


public class Test {

	public static void main(String[] args) {
		Subject sub = new SubjectImpl();
		DynamicProxy dcp = new DynamicProxy(sub);
		Subject subproxy = (Subject) Proxy.newProxyInstance(sub.getClass().getClassLoader(), sub.getClass().getInterfaces(), dcp);
		subproxy.rent();
		subproxy.hello("Hello");
	}
	
}
