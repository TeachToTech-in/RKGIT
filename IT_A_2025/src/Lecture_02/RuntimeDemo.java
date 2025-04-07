package Lecture_02;

class A {
	void show() {
		System.out.println("I am Show Of A");
	}
}

class B extends A {
	void show() {
		System.out.println("I am Show Of B");
	}
}

public class RuntimeDemo {
	public static void main(String[] args) {
		A a1 = new B();
		a1.show();
	}
}
