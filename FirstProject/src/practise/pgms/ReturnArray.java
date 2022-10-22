package practise.pgms;

import java.util.Arrays;

public class ReturnArray {
	int[] reurnOneDimensionalArray() {
		int[] oneDimensionalArray = { 1, 2, 3, 4 };
		return oneDimensionalArray;
	}

	int[][] reurnTwoDimensionalArray() {
		int[][] twoDimensionalArray = { { 1, 2, 3 }, { 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 } };
		return twoDimensionalArray;
	}

	String[] returnStringArray() {
		String[] s = { "cat", "dog", "rabbit" };
		return s;
	}

	public static void main(String[] args) {
		ReturnArray r = new ReturnArray();
		System.out.println("The elements in the 1-dimensional array using toString(),for each,for loop");
		int[] a = r.reurnOneDimensionalArray();
		System.out.println(Arrays.toString(a));
		for (int i : a)
			System.out.print(i + " ");
		System.out.println();
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		int[][] ta = r.reurnTwoDimensionalArray();
		System.out.println("The elements in the 2-dimensional array are");
		for (int i = 0; i < ta.length; i++) {
			for (int j = 0; j < ta[i].length; j++) {
				System.out.print(ta[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("printing two dimensional array using for each loop");
		for (int[] i : ta)
			System.out.println(Arrays.toString(i));

		String[] s = r.returnStringArray();
		System.out.println(Arrays.toString(s));
		for(String i:s)
		System.out.println(i);
	}
}
