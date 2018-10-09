package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	private final List<Component> children = new ArrayList<>();
	
	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		children.remove(c);
	}

	@Override
	public void display() {
		System.out.println("composite "+name);
		children.forEach(e->{
			e.display();
		});
	}

}
