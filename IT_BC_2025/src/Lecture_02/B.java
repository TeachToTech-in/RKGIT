package Lecture_02;
//The type B cannot subclass the final class A
public class B extends A {
	int y;

	public B() {
		super();
		// TODO Auto-generated constructor stub
	}

	public B(int y, int x) {
		super(x);
		this.y = y;
	}
//Cannot override the final method from A
	void show() {
		System.out.println("The Value of Y" + y);
		super.show();
	}
	void xyz() {
		System.out.println("The XYZ MEthod Invoked");
	}
}
