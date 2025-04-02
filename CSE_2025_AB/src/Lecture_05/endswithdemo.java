package Lecture_05;

public class endswithdemo {
	public static void main(String [] args) {
		String m= "helloworld";
		String s="world";
		if(endswith(m,s)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}


public static boolean endswith(String m,String s) {
	if(s.length()>m.length()) {
		return false;
	}
	int startIndex=m.length()-s.length();
	for(int i=0;i<s.length();i++) {
		if(m.charAt(startIndex+i)!=s.charAt(i)) {
			return false;
		}
	}
	return true;
}
}