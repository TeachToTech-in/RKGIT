package Lecture_02;

abstract class Demo {
public void show() {
	System.out.println("Show of Demo");
}
//The abstract method m1 in type Demo can only 
//be defined by an abstract class
abstract public void m1();
}
interface I1{
	int x=10;
	void m1();
	void m2();
}
class Demo1 extends Demo{
	public void m1() {
		System.out.println("The Demo1");
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
		Demo d = new Demo1();
	}
}
