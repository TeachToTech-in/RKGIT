package Lecture_05;

public class equalignorecasedemo {
	public static boolean equalignorecase(String str1,String str2) {
		if(str1==null && str2 ==null){
			return false;
	}
		if(str1==null || str2 ==null) {
			return false;
		}
		if(str1.length()!=str2.length()) {
			return false;
		}
		for(int i=0;i<str1.length();i++) {
			char ch1=str1.charAt(i);
			char ch2= str2.charAt(i);
			if(toLower(ch1)!=toLower(ch2)) {
				return false;
			}
		}
		return true;
}
	private static char toLower(char ch) {
		if (ch>='A' && ch<='Z') {
			return(char)(ch +32);
		}
		return ch;
	}
	public static void main(String[] args) {
		System.out.println(equalignorecase("Hello","heldo"));
	}
}