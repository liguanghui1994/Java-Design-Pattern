package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

	private Object subject;
	
	public DynamicProxy(Object subject) {
		this.subject = subject;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("前置处理");
		System.out.println("调用方法： "+method);
		method.invoke(subject, args);
		return "代理完毕";
	}

}
