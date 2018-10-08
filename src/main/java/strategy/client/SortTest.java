package strategy.client;

import strategy.hander.ArrayHander;
import strategy.sort_impl.InsertionSort;
import strategy.sort_impl.QuickSort;
import strategy.sort_impl.SelectionSort;

public class SortTest {

	public static void main(String[] args) {
		//多个策略类
		InsertionSort insert = new InsertionSort();
		QuickSort quicksort = new QuickSort();
		SelectionSort selectsort = new SelectionSort();
		
		int[] arr = new int[] {1,9,3,5,16,37,2};
		//由客户端自己去选择哪个策略类
		ArrayHander arryhander = new ArrayHander(insert);
		int[] sortarr = arryhander.sort(arr);
		for(int i : sortarr){
			System.out.println(i);
		}
	}

	/*
	 * 跟工厂模式在结构上极其相似，就有一点点不同。
	 * 	策略模式的具体实现类是由使用者自己去选择传入的，对使用者透明，相当于白盒
	 * 	工厂模式的实现类对使用者是不透明的，使用者不知道调用了哪个类，
	 * 		是传入参数由设计者抉择，相当于黑盒。	
	 * 
	 */
}
