package LECTURE_02;
interface I1{
	void m1();
}
class XYZ1 implements I1{
	//Cannot reduce the visibility of the inherited method from I1
	public void m1() {
		System.out.println("I am m1");
	}
}
public class AbstractDemoInterface {
public static void main(String[] args) {
	//Cannot instantiate the type Demo
	I1 d1 = new XYZ1();
	//d1.display();
	//The method m1() is undefined for the type I1
	d1.m1();
}
}
