package Lecture_05;
//normal Interface 
interface I1 {
	void sum (int x, int y);
	void sum (int x, float y);
}
//Markaer Interface
interface I2{
	//doesnt contain any  methods / field
}
//Fuctional Interface 
interface I3 {
	void sound();
	default void sum () {
		System.out.println("This Is Default");
	}
	static void sun() {
		System.out.println("This is Static method");
	}
}
//Illegal modifier for the class Animal; 
//only public, abstract & final are permitted
 class Animal{
	 static class A {
		 
	 }
	 int x ; 
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(int x) {
		super();
		this.x = x;
	}
	void sound () {
		System.out.println("Make Sound");
	}
}

public class InterfaceDemo {

}
