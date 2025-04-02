package Lecture_05;
import java.util.Scanner;
//program to find the first index of character
public class inde1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch= sc.next().charAt(0);
		int index=-1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) { index = i; break;}
		}
		System.out.println(index);
		sc.close();
		
		
	}


}
