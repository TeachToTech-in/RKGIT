package Lecture_04;

public class StringProgramsDemo {
	public static void main(String[] args) {
		StringProgram s1= new StringProgram();
		System.out.println(s1.AreStrigEqual("rahul", "rahul"));
		System.out.println(s1.isEqualsIgnoreCase("Rahul", "rahul"));
		System.out.println(s1.FirstIndexof("ahiansha", 'a'));
		System.out.println(s1.lastIndexOf("ahiansha", 'a'));
		System.out.println(s1.firstIndexOfSubstring("Rahul ullman", "ull"));
		System.out.println(s1.lastIndexOfSubstring("Rahul ullman ullman", "ull"));
	}
}
