package Lecture_02;
 class A{
	 //The blank final field a may not have been initialized
	final int a;
	A(){
		a=0;
		System.out.println("Constructor");
	}
	//initialization block
	A(int x){
		a=x;
		System.out.println("Initialization block");
	}
	void show() {
		System.out.println("I am A");
	}
}
//The type B cannot subclass the final class A
class B extends A{
	//Cannot override the final method from A
	void show() {
		System.out.println("I am B");
	}
}
public class FinalExample {
 public static void main(String[] args) {
	final int x;
	x=12;
	//The final local variable x may already have been assigned
	//x=23;
	new A();
}
}
