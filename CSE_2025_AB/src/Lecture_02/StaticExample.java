package Lecture_02;
class Demo{
	static int y;
	//static
	static {
		y =20;
	}
	Demo(){
		//The final field Demo.y cannot be assigned
		y =12;
	}
	static void show() {
		System.out.println("Parent");
	}
}

class child extends Demo{
	//This instance method cannot override the static method from Demo
	static void show() {
		System.out.println("Child ");
	}
}
public class StaticExample {
public static void main(String[] args) {
	System.out.println(Demo.y);
	//Demo d1 = new child();
	child c1 = null;
	c1.show();
	//d1.show();
}
}
