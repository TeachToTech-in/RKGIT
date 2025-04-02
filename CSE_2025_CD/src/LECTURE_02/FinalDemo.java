package LECTURE_02;

class X {
	// The blank final field a may not have been initialized
	final static int a=78;
	// initialization block
	static{
		//a = 20;
	}
	
	X() { // a=20;
	}
	
	X(int a) {
		// this();
		// this.a=a;
	}

	void m1() {
		// The final field X.a cannot be assigned
		// a=80;
		System.out.println("The is final");
	}
}

//The type Y cannot subclass the final class X
class Y extends X {

	void m1() {
		System.out.println("Cannot override the final method from X");
	}
}

public class FinalDemo {
	public static void main(String[] args) {
		final int x;
		x = 12;
		// The final local variable x may already have been assigned
		x = 23;
	}
}
