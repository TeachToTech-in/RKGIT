package Lecture_04;

public class StaticNestedDemo {
	 public static void main(String[] args) {
	        OuterClass.StaticNested obj = new OuterClass.StaticNested();
	        obj.display();
	    }
}
class OuterClass {
    static class StaticNested {
        void display() {
            System.out.println("Inside static nested class.");
        }
    }
}

