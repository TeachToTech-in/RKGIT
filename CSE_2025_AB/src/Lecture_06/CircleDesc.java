package Lecture_06;

import java.util.Comparator;
import Lecture_01.*;
public class CircleDesc implements Comparator<Circle> {

	@Override
	public int compare(Circle o1, Circle o2) {
		
		return o2.getRadius()-o1.getRadius();
	}

}
