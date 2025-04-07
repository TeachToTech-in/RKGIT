package Lecture_02;

//final 
class X {
	//Member | Instance 
	//The blank final field z may not have been initialized
	final int z;
	X(){
		z=10;
	}
	X(int z){
		this.z=z;
	}
	//class Variable
	static int k;
	final void xyz(int x, int y) {
		System.out.println("The Sum of Two Values is " + (x + y));
	}
}

//The type Y cannot subclass the final class X
class Y extends X {
	// Cannot override the final method from X
//	void xyz(int x , int y) {
//		System.out.println("The Multiply of Two Values is "+(x*y));
//	}
}

public class FinalDemo {
	public static void main(String[] args) {
			final int x;
			x=10;
			//The final local variable x may already have been assigned
			x=12;
	}
}
