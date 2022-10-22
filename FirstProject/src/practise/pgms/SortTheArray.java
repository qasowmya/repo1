package practise.pgms;

public class SortTheArray {
	int[] sortArray(int[] a) {
		// int l=a.length;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] < a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}

	void dispaly(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

	}

	public static void main(String[] args) {
		SortTheArray sta = new SortTheArray();
		System.out.println("the lements in the array before sorting:");
		int[] a = { 23, 56, 78, 90, 1, 4, 8, 9 };
		sta.dispaly(a);
		System.out.println();
		int[] a1 = sta.sortArray(a);
		System.out.println("elements in the sorted array are");
		sta.dispaly(a1);
		// System.out.println("highest element in the array is:"+a[0]);
		// System.out.println("the largest element in the array is");
	}

}
