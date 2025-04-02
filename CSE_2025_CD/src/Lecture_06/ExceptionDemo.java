package Lecture_06;

import java.awt.image.ImagingOpException;
import java.io.IOException;

public class ExceptionDemo {
	public static void main(String[] args) throws IOException
	{
		int x = 0;
		int y = 20;
		int z;
		System.out.println("Before Exception");
		try {
			if (x == 0)
				throw new ArithmeticException();
			z = y / x;
		}

		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Caught and HAndelled");
		}

		System.out.println("After Exception");
		demo();

	}

	public static void demo() throws IOException {
		throw new IOException();
	}
}
