package LECTURE_02;
abstract class Demo{
	void display() {
		System.out.println("Hello Abstracts");
	}
	//The abstract method m1 in type Demo can 
	//only be defined by an abstract class
	abstract void m1();
}
class XYZ extends Demo{
	void m1() {
		System.out.println("I am m1");
	}
}
public class AbstractDemo {
public static void main(String[] args) {
	//Cannot instantiate the type Demo
	Demo d1 = new XYZ();
	d1.display();
	d1.m1();
}
}
