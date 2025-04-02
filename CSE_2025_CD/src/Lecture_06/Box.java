package Lecture_06;

public class Box <T extends Number> {
	T x;

	public Box() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Box(T x) {
		super();
		this.x = x;
	}

	@Override
	public String toString() {
		return "Box [x=" + x + "]";
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public boolean equals(Box b) {
		return this.x==b.x;
	}
}
