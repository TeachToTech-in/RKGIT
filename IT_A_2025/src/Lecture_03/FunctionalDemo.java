package Lecture_03;
interface I1{
	void m1();
	default void m3() {
		System.out.println("This is Default");
	}
}
public class FunctionalDemo {

}
