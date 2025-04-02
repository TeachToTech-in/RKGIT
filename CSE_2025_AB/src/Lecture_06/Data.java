package Lecture_06;

public class Data <T extends Number> {
	private T x ;

	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Data(T x) {
		super();
		this.x = x;
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "Data [x=" + x + "]";
	}
	
}
