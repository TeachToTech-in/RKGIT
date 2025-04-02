package Lecture_05;

class StringMethods {
	String mainString;
	StringMethods(String mainString){
		this.mainString=mainString;
	}
	boolean equals(String subString) {
		if (mainString.length()!=subString.length()) {
			return false;
		}
		for (int i =0; i<mainString.length(); i++) {
			if (mainString.charAt(i)!=subString.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
public class StringDemo{
	public static void main(String[] ags) {
		StringMethods str = new StringMethods("Hello");
		String main1="Hello";
		String main3="hello";
		System.out.println(str.equals(main3));
		System.out.println(str.equals(main1));
	}
}