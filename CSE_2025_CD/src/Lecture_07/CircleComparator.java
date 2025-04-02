package Lecture_07;

import java.util.Comparator;

import LECTURE_01.Circle;

public class CircleComparator implements Comparator<Circle> {

	@Override
	public int compare(Circle o1, Circle o2) {
		// TODO Auto-generated method stub
		return o2.getRadius()-o1.getRadius()9;
	}

	

}
