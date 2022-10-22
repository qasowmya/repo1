package practise.pgms;

import java.util.Scanner;

public class ForEachExample {

	int findHighestElement(int[] a) {
		int highestValue = 0;
		for (int i : a) {
			if (i > highestValue) {
				highestValue = i;
			}
		}
		return highestValue;
	}

	int[] readValues() {
		// first read array size
		// reading one dimensional array values using scanner class
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("enter the elements in the array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}
	public static void main(String[] args) {
		ForEachExample f = new ForEachExample();
		// loading array values by calling method
		int[] a = f.readValues();
		String[] s = { "rohan", "sresta", "sraddha" };
		char[] c = { 'a', 'e', 'i', 'o', 'u' };
		int sum = 0;
		for (String i : s) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : a) {
			sum = sum + i;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("sum of int values in the array are " + sum);
		for (char ch : c) {
			System.out.print(ch + " ");
		}
		System.out.println();
		System.out.println("the highest element in the array is:");
		// ForEachExample f=new ForEachExample();
		int highestElement = f.findHighestElement(a);
		System.out.println(highestElement);
		
	}
}
