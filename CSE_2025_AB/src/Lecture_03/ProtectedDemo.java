package Lecture_03;
interface X{
	default void m1(){
		System.out.println("I am X Default");
	}
}
interface Y{
	default void m1(){
		System.out.println("I am Y Default");
	}
}
//Duplicate default methods named m1 with the parameters () 
//and () 
//are inherited from the types Y and X
public class ProtectedDemo implements X,Y {
	public static void main(String[] args) {
		ProtectedDemo p = new ProtectedDemo();
	}
}
