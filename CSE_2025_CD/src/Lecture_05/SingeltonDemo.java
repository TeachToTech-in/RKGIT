package Lecture_05;
//Singelton class Example
class A {
	static private A a1 = null;

	private A() {

	}

	static A getInstance() {
		if (a1 == null)
			a1 = new A();
		return a1;
	}
}

public class SingeltonDemo {
	public static void main(String[] args) {
		A a1 = A.getInstance();
		System.out.println(a1);
		A a2 = A.getInstance();
		System.out.println(a2);
	}
}
