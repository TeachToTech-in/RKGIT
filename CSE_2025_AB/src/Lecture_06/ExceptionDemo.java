package Lecture_06;

public class ExceptionDemo {
	public static void main(String[] args) {
		int x = 19, y = 0,z=0;
		System.out.println("Before Exception");
		try {
		z=x/y;
		}
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		catch(Exception e) {
			System.out.println();
		}
		
		System.out.println("After Exception");
	}
}
