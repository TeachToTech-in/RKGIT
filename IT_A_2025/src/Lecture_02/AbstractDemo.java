package Lecture_02;
interface I1 {
	int x=90;
	void m1();
	default void m2() {
		System.out.println("I am Interface default method");
	}
	static void m3() {
		System.out.println("I am Interface static method");
	}
}
abstract class Demo {
	void show() {
		System.out.println("I am Demo ");
	}
	
	abstract int xyz(int a,int b);
}
//The type ChildDemo must implement the 
//inherited abstract method Demo.xyz(int, int)

//The type ChildDemo must implement the 
//inherited abstract method I1.m1()
class ChildDemo extends Demo implements I1{
	public int xyz(int a ,int b) {
		return a+b;
	}
	public void m1() {
		System.out.println("I am Inherited from I1");
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		// Cannot instantiate the type Demo
		Demo d1 = new ChildDemo();
		d1.show();
	}
}
