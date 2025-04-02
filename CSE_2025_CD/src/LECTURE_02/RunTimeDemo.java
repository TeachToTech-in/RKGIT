package LECTURE_02;
class A {
	int x;

	void show() {
		System.out.println("The Value of X " + x);
	}
}

class B extends A {
	int y;
	void xyz(){}
	void show() {
		System.out.println("The Value of X " + x);
		System.out.println("The Value of Y " + y);
	}
}

public class RunTimeDemo {
	
	public static void main(String[] args) {
			A a1 = new B();
			A a2 = new A();
			a1.show();
			a2.show();
			//The method xyz() is undefined for the type A
			//a1.xyz();
	}
}
