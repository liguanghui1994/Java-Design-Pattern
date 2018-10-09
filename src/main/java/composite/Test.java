package composite;

/**
 * 组合模式：
 * 	1、组合模式主要应用于树形结构，比如一个大部门下面有很多小部门，每个小部门的职责不同。
 * 	2、如果不用设计模式，每次进行方法调用必须进行判断，看是哪种部门，以后万一增加了新类型部门，
 * 		又得修改之前的代码，不符合"开闭原则"。
 *  解决方案：组合模式使得用户对单个对象和组合对象的使用具有一致性
 *  	
 *  
 * @author guanghui
 *
 */
public class Test {
	public static void main(String[] args) {
		
		Component root = new Composite("root");
		
		root.add(new Leaf("A"));
		root.add(new Leaf("B"));
		root.add(new Leaf("C"));
		
		Component d = new Composite("D");
		d.add(new Leaf("D1"));
		d.add(new Leaf("D2"));
		d.add(new Leaf("D3"));
		root.add(d);
		
		root.display();
	}
	
}
