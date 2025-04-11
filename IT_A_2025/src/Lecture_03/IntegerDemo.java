package Lecture_03;

public class IntegerDemo {
public static void main(String[] args) {
	//Boxing
	Integer i1 = new Integer(10);
	//Auto Boxing
	Integer i2 = 10;
	Integer i3 = 10;
	System.out.println(i2==i3);

	i2 = 100;
	i3 = 100;
	System.out.println(i2==i3);
	

	i2 = 150;
	i3 = 150;
	System.out.println(i2==i3);
	
	Integer i4 = Integer.valueOf(12);
	System.out.println(i4);

	Integer i5 = Integer.valueOf("AZ",37);
	System.out.println(i5);
	//Auto Unboxing
	///int i = i2;
}
}
