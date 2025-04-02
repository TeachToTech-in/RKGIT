package Lecture_04;
interface Shape {
	
}
class Circle implements Shape{
	
}
class Rectangle implements Shape{
	
}
public class IntegerDemo {
	public static void main(String[] args) {
		Shape s = new Circle();
		Shape s1 = new Rectangle();
		System.out.println(s==s1);
		System.out.println(s1 instanceof Circle);
			//	Integer i1 = Integer.valueOf("JJJJ",36);
			//	System.out.println(i1.longValue());
	}
}
