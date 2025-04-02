package Lecture_04;

public class ArrayPrograms {
	void reverse(int[] array) {
		int i = 0, j = array.length - 1;
		for (; i < j; i++, j--)
			swap(array, i, j);
	}

	void printArray(int[] array) {
		System.out.print("[");
		for (int i : array) {
			System.out.print(" "+i+" ");
		}
		System.out.println("]");
	}

	public void swap(int[] array, int i, int j) {
		array[i] = array[i] ^ array[j];
		array[j] = array[i] ^ array[j];
		array[i] = array[i] ^ array[j];
	}
}
