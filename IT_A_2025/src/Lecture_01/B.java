package Lecture_01;

public class B extends A {
	int y;

	public B() {
		y = 2;
		System.out.println("This is No Argument Of B");
	}

	public B(int x ,int y) {
		this();
		//Constructor call must be the 
		//first statement in a constructor
		//this();
		this.y = y;
		System.out.println("This is Parameterized Of B");
	}

	public void showY() {
		System.out.println("The Value of Y" + y);
	}
}
