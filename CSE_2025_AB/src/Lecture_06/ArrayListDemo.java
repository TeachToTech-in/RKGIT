package Lecture_06;

import java.util.ArrayList;
import java.util.Collections;
import Lecture_01.*;
public class ArrayListDemo {
	public static void main(String[] args) {
			ArrayList<Circle> a1 = new ArrayList<>();
			a1.add(new Circle(23));
			a1.add(new Circle(12));
			a1.add(new Circle(234));
			System.out.println(a1);
			Collections.sort(a1,new CircleDesc());
			System.out.println(a1);
	}
}
