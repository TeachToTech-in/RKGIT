package Lecture_03;
class A{
	private int x ;

	@Override
	public String toString() {
		return "A [x=" + x + "]";
	}
	public boolean equals(A a1) {
		//x cannot be resolved or is not a field
		//A a1 = (A) o1;
		return this.x==a1.x;
	}
	
}
public class ProtectedDemo {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
	}


}
