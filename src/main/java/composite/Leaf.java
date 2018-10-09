package composite;

public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		throw new NoSuchMethodError("不支持当前方法。");
	}

	@Override
	public void remove(Component c) {
		throw new NoSuchMethodError("不支持当前方法。");
	}

	@Override
	public void display() {
		System.out.println("leaf"+name);
	}

}
