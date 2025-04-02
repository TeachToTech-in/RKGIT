package LECTURE_01;


public class HelloWorld {

	public static void main(String[] args) {
		//System.out.println("Hello World");
		//The constructor Circle(int) is undefined
		Circle c = new Circle(45);
		//The field Circle.radius is not visible
		//c.radius=10;
		//c.setRadius(12);
		c.show();
		System.out.println("The Area of the circle is :"+c.getArea());

	}

}
