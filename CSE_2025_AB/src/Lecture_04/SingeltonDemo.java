package Lecture_04;
class Demo{
	private static Demo d=null;
	private Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Demo getInstance(){
		//Cannot make a static reference to the non-static field d
		if(d==null)
		d= new Demo();
		return d;
	}
	
}
public class SingeltonDemo {
	public static void main(String[] args) {
		Demo d1 = Demo.getInstance();
		Demo d2 = Demo.getInstance();
		System.out.println(d1);
		System.out.println(d2);
	}
}
