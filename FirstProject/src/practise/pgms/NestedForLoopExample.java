package practise.pgms;

public class NestedForLoopExample {

	void printStarPattern() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	int highestElementInTheArray(int[] a) {
		int highValue = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				int currentValue = a[i];
			} else
				highValue = a[i + 1];
		}

		return highValue;
	}

	public static void main(String[] args) {
		NestedForLoopExample n = new NestedForLoopExample();
		n.printStarPattern();
		int[] a = { 200, 99, 23, 45, 67, 21, 1, 100 };
		int highValue = n.highestElementInTheArray(a);
		System.out.println(highValue);
	}

}
