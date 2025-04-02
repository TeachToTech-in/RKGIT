package LECTURE_01;
class A{
	private int x ;
	void showX() {
		System.out.println("The Value of x "+x);
	}
}
class B extends A{
	int y ;
	void showy() {
		System.out.println("The Value of y "+y);
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
		B b1 = new B();
		b1.showX();
	}
}
