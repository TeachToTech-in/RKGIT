package LECTURE_01;

public class Circle  implements Comparable{
	private int radius;
	public Circle(){
		System.out.println("This is No argument");
		radius=5;
	}
	public Circle(int radius){
		
		//Constructor call must be the first statement in a constructor
		//super();
		this();
		System.out.println("This is Parameterizeds");
		this.radius=radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	double getArea() {
		return 3.14 * radius * radius;
	}
	void show() {
		System.out.println("The radius of Circle is :"+radius);
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.radius-((Circle)o).radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}

