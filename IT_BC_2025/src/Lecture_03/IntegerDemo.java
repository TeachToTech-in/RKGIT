package Lecture_03;

import Lecture_02.A;

public class IntegerDemo {
	public static void main(String[] args) {
//		A a1 = new A(12);
//		A a2 = new A(12);
//		System.out.println(a1.toString());
//		System.out.println(a1.equals(a2));
//		System.out.println(a1==a2);

		// Auto Boxing
		Integer i = 129;
		Integer i2 = 129;
		System.out.println(i == i2);
		i = 120;
		i2 = 120;
		System.out.println(i == i2);
		i = 130;
		i2 = 130;
		System.out.println(i == i2);

		Integer i4 = Integer.valueOf(12);
		System.out.println(i4);

		Integer i5 = Integer.valueOf("546",37);
		System.out.println(i5);
	}
}
