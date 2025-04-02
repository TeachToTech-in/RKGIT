package Lecture_06;

public class NumberPrograms {

	public static int basetodecimal(String num, int base) {
		int decvalue = 0;
		int power = 0;
		if (base < 2 && base > 36)
			return -1;
		for (int i = num.length() - 1; i >= 0; i--) {
			char digit = num.charAt(i);
			int value;
			if (digit >= '0' && digit <= '9') {
				value = digit - '0';
			} else {
				value = digit - 'A' + 10;
			}
			if (value >= base)
				return -1;
			decvalue += value * Math.pow(base, power);
			power++;
		}
		return decvalue;
	}

	public static String decimaltohexa(int decimal) {
		String hex = "";
		char[] hexdigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

		while (decimal > 0) {
			hex = hexdigits[decimal % 16] + hex;
			decimal /= 16;

		}
		return hex.isEmpty() ? "0" : hex;
	}

	public static String decimaltoAnyBase(int decimal, int base) {
		String hex = "";
		char[] hexdigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
				'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		while (decimal > 0) {
			hex = hexdigits[decimal % base] + hex;
			decimal /= base;

		}
		return hex.isEmpty() ? "0" : hex;
	}

	public static int rotateleftbits(int num, int bits) {
		int size = 32;
		return (num << bits) | (num >> (size - bits));
	}

	public static void main(String[] args) {
		// System.out.println(basetodecimal("103", 2));
		// System.out.println(decimaltohexa(1243));
		System.out.println(decimaltoAnyBase(10, 8));
	}
}
