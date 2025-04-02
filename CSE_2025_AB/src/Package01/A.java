package Package01;

public class A {
	int y;

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	public A(int y) {
		super();
		this.y = y;
	}
	
	public String toString() {
		return "A [y=" + y + "]";
	}
	//y cannot be resolved or is not a field
	public boolean equals(Object o1) {
		A a1 = (A)o1;
		return this.y==a1.y;
	}
}
