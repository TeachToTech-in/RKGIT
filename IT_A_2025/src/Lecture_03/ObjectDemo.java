package Lecture_03;

import Lecture_01.A;

public class ObjectDemo {
public static void main(String[] args) {
	A a1 = new A(12);
	A a2 = new A(12);
	System.out.println(a1.toString());
	System.out.println(a1==a2);
	System.out.println(a1.equals(a2));
	
}
}
