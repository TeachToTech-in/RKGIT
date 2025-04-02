package Lecture_05;

public class EqualsIgnoreCase_Nadeem_139 {
	public static boolean eualsIgnoreCase(String str1 , String str2) {
		if(str1.length()!=str2.length())return false;
		
		for(int i=0;i<str1.length();i++) {
			int ascii11 = str1.charAt(i)-'A';
			int ascii12 = str1.charAt(i)-'a';
			int ascii21 = str2.charAt(i) -'A';
			int ascii22 = str2.charAt(i) -'a';
			if(ascii11 == ascii21 || ascii11 == ascii22 || ascii12 == ascii21 || ascii12 == ascii22)continue;
			else return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(eualsIgnoreCase("nadeem","Naadem"));
	}
}
