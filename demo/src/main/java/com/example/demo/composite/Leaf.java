package com.example.demo.composite;

public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}
	
	@Override
	public void add(Component c) {
		System.out.println("cannot add to a leaf");

	}

	@Override
	public void remove(Component c) {
		System.out.println("cannot remove to a leaf");

	}

	@Override
	public void display(int depth) {
		System.out.println(depth + " " + this.name);

	}

}
