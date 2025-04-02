package Lecture_02;

interface i1{
	//The blank final field x may not have been initialized
	int x=90;
	void d1();
}
abstract class Demo1{
	//Abstract Class May Contain Concrete Method
	void show() {
		System.out.println("I am Demo1");
	}
	abstract void m1();
}
//The type Demo2 must implement the 
//inherited abstract method Demo1.m1()
class Demo2 extends Demo1{
	void m1() {
		System.out.println("Hi Demo2");
	}
}
public class AbstractIonExample {
public static void main(String[] args) {
	//Cannot instantiate the type Demo1
	Demo1 d = new Demo2();
}
}
