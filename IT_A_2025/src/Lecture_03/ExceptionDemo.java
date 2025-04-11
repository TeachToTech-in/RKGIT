package Lecture_03;

import java.io.IOException;

public class ExceptionDemo {
	public static void main(String[] args) {
				int x =0;
				int y =10;
				int z ;
				System.out.println("Before Exception");
				try {
				z=y/x;
				}
				//catch All Handler
				catch(Exception e) {
					System.out.println(e);
				}
				//xyz();
				System.out.println("After Exception");
				
				
				
	}
	
	public static void xyz() throws IOException
	{
		//Unhandled exception type IOException
	
		throw new IOException();
		
	}
}
