package Lecture_02;

public class A {
	 int x;

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	public A(int x) {
		super();
		this.x = x;
	}

	final void show() {
		System.out.println("The Value of X" + x);
	}

	@Override
	public String toString() {
		return "A [x=" + x + "]";
	}
	public boolean equals(A a) 
	{
		return this.x==a.x;
	}
}
