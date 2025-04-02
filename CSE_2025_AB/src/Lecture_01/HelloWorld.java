package Lecture_01;

public class HelloWorld {
	public static void main(String[] args) {
		//The constructor Circle() is undefined
			Circle c = new Circle(10);
			//Circle c1 = new Circle();
			//The field Circle.radius is not visible
			//c.radius=10;
			//c1.radius=11;
			//c.setRadius(10);
			//c1.setRadius(12);
			System.out.println("The Radius of Circle C "+c.getRadius());
			System.out.println("The Area of C "+c.getArea());
			//System.out.println("The Area of C1 "+c1.getArea());
	}
}
