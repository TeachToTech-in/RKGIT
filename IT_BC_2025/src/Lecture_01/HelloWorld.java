package Lecture_01;
class Circle{
	private int radius;
	Circle(){
		radius = 5;
	}
	Circle (int radius){
		this.radius=radius;
	}
	double getArea(){
		return 3.14*radius*radius;
	}
	void setRadius(int x){
		radius = x;
	}
}
public class HelloWorld {
	public static void main(String[] args) {
		Circle c = new Circle(12);
		//The field Circle.radius is not visible
		//c.setRadius(12);
		System.out.println(c.getArea());
		
	}
}
