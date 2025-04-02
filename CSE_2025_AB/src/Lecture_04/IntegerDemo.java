package Lecture_04;

public class IntegerDemo {
	public static void main(String[] args) {
		/*	Integer i1 = 44;
			Integer i2 = 44;
			System.out.println(i1==i2);
			
			i1 = 500;
			i2 = 500;
			System.out.println(i1==i2);
			

			i1 = 100;
			i2 = 100;
			System.out.println(i1==i2);
			
			i1 = 125;
			i2 = 125;
			System.out.println(i1==i2);
			

			i1 = 127;
			i2 = 127;
			System.out.println(i1==i2);
			

			i1 = -128;
			i2 = -128;
			System.out.println(i1==i2);
			System.out.println(Integer.MIN_VALUE);
			System.out.println(Integer.MAX_VALUE);
			Integer i3 = new Integer("101");
			System.out.println(i3);*/
		
		Integer i1 = Integer.valueOf("4321",15);
		System.out.println(Integer.toHexString(i1));
		System.out.println(Integer.rotateLeft(4321, 2));
		System.out.println(Integer.highestOneBit(-15));

	}
}
