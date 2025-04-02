package Lecture_06;

public class BoxDemo {
	public static void main(String[] args) {
			Box <Integer>b1 = new Box<Integer>(39);
			System.out.println(b1);
			Box <Float>b2 = new Box<Float>(39.9f);
			System.out.println(b2);
			Box <String>b3 = new Box<String>("Rahul");
			System.out.println(b3.equals(b1));
			b3 = b1;
	}
	
}
