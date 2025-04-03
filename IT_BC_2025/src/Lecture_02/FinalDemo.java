package Lecture_02;
class FinalMember{
	//The blank final field m may not have been initialized
	final int m;
	{
		m=20;
	}
}
public class FinalDemo {
	public static void main(String[] args) {
			final int x;
			x=10;
			System.out.println("The value of x "+x);
	}
}
