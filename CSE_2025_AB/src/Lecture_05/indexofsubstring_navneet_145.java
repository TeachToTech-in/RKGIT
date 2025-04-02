package Lecture_05;
import java.util.Scanner;

public class indexofsubstring_navneet_145 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The String ");
			String s = sc.nextLine();
			System.out.println("Enter The Sub String ");
			String sub = sc.nextLine();
			StringProblem s1 = new StringProblem();
			System.out.println(s1.indexOfSubstring(s, sub));
			System.out.println(s1.lastindexofstring(s,sub));
			
	}

}
class StringProblem{
	int indexOfSubstring(String s , String sub) {
		int k=-1;
		if(s.length()<sub.length())
		return k;
		
		int j = 0;
		for(int i = 0 ;i<s.length();i++) {
			if(s.charAt(i)==sub.charAt(j)&& j>=0 && j<sub.length())
			{
				if(k==-1)
					k=i;
				j++;
			if(j==sub.length()-1)
				return k;
			}
			else {
				j=0;
				k=-1;
			}
		} 
		return k;
		
	}
	
	
	int lastindexofstring(String s,String sub) {
		if(sub.length()>s.length())
		{
			return -1;
		}
		for(int i=s.length()-sub.length();i>=0;i--) {
			int j=0;
			for( j=0;j<sub.length();j++) {
				if(s.charAt(i+j)!=sub.charAt(j)) {
					break;
				}
			}
			if(j==sub.length()) {
				return i;
			}
		}
		return -1;
	}
}
