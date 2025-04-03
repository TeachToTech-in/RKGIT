package Lecture_02;

public class RuntimeDemo {
	public static void main(String[] args) {
		A a1 = new B(10,20);
		a1.show();
		//The method xyz() is undefined for the type A
		//a1.xyz();
		System.out.println(a1.x);
		//y cannot be resolved or is not a field
		System.out.println(a1.y);
		
	}
}
