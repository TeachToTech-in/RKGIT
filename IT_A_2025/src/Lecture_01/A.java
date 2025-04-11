package Lecture_01;

public class A {
	private int x;
	public A() {
		x=3;
		System.out.println("This is No Argument Of A");
	}
	public A(int x) {
		this.x=x;
		System.out.println("This is Parameterized Of A");
	}
	public void showX() {
		System.out.println("THe value of X "+x);
	}
	@Override
	public String toString() {
		return "A [x=" + x + "]";
	}
	
}
