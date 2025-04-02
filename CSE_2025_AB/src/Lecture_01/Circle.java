package Lecture_01;

public class Circle implements Comparable<Circle> {

	private int radius;
	//Noargument 
	public Circle(){
		radius=0;
		System.out.println("This is Noargument");
	}
	public Circle(int radius){
		this();
		this.radius = radius;
		System.out.println("This is Parameterized");
	}

	public double getArea() {
		return radius * radius * 3.14;
	}

	public void show() {
		System.out.println("The Radius of the Circle is" + radius);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	@Override
	public int compareTo(Circle o) {
		// TODO Auto-generated method stub
		return this.radius-o.radius;
	}
	
}
