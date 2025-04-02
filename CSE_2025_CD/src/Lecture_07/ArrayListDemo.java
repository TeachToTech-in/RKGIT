package Lecture_07;

import java.util.ArrayList;
import java.util.Collections;

import LECTURE_01.Circle;

public class ArrayListDemo {
	public static void main(String[] args) {
				ArrayList a1 = new ArrayList<>();
				a1.add(new Circle(55));
				a1.add(new Circle(22));
				a1.add(new Circle(25));
				System.out.println(a1);
				Collections.sort(a1,new CircleComparator());
				System.out.println(a1);
	}
}
