package Lecture_07;

public class BitsManipulation {
  static boolean isPowerOftwo(int n)
  {
	  if(n==0)
	  {
		  return false;
	  }
	  while(n%2==0)
	  {
		  n=n/2;
	  }
	  if(n==1)
	  {
		  return true;
	  }
	  return false;
  }
  public static void main(String [] args)
  {
	  System.out.println(isPowerOftwo(10));
	  
  }
}
