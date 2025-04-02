package Lecture_04;

public class StringProgram {
	public boolean AreStrigEqual(String str1, String str2) {
		if (str1 == null || str2 == null) {
			return false;
		}
		if (str1.length() != str2.length()) {
			return false;
		}
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	public boolean isEqualsIgnoreCase(String s1, String s2) {
		String str1 = s1.toLowerCase();
		String str2 = s2.toLowerCase();
		return AreStrigEqual(str1, str2);
	}

	public static boolean eualsIgnoreCase(String str1, String str2) {
		if (str1 == null && str2 == null && str1.length() != str2.length())
			return false;

		for (int i = 0; i < str1.length(); i++) {
			int ascii11 = str1.charAt(i) - 'A';
			int ascii12 = str1.charAt(i) - 'a';
			int ascii21 = str2.charAt(i) - 'A';
			int ascii22 = str2.charAt(i) - 'a';
			if (ascii11 == ascii21 || ascii11 == ascii22 || ascii12 == ascii21 || ascii12 == ascii22)
				continue;
			else
				return false;
		}
		return true;
	}

	// Find the First Index of Given Character in a String
	int FirstIndexof(String s1, char c) {
		int i;
		for (i = 0; i < s1.length(); i++) {
			if (c == s1.charAt(i))
				return i;
		}
		return -1;
	}

//Function to Find First Index Of Given Substring in a String 
	int lastIndexOf(String s1, char c) {
		if (s1 == null || c == '\0')
			return -1;
		for (int i = s1.length() - 1; i >= 0; i--) {
			if (s1.charAt(i) == c)
				return i;

		}
		return -1;
	}

	int firstIndexOfSubstring(String s, String sub) {
		int k = -1, j = 0;
		if (s == null || sub == null || sub.length() > s.length())
			return k;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == sub.charAt(j)) {
				if (k == -1)
					k = i;
				if (j == sub.length() - 1)
					return k;
				j++;
			} else {
				j = 0;
				k = -1;
			}
		}
		return k;
	}

	// Function to Find Last Index Of Given Substring

	int lastIndexOfSubstring(String s, String sub) {
		if (s == null || sub == null || sub.length() > s.length())
			return -1;
		int j = sub.length() - 1;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == sub.charAt(j)) {

				if (j == 0)
					return i;
				j--;
			} else {
				j = sub.length() - 1;
			}
		}
		return -1;
	}

}
