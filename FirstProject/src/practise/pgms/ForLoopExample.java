package practise.pgms;

public class ForLoopExample {

	void printEvenNumbers() {
		System.out.println("printimg even numbers from 1 to 100");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
//		System.out.println();
	}

	void printOddNumbers() {
		System.out.println("printimg odd numbers from 1 to 100");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

	}

	public static void main(String[] args) {
		// ForLoopExample f=new ForLoopExample();
		// f.printEvenNumbers();
		// f.printOddNumbers();
		System.out.println("odd numbers from 100 to 1");
		for (int i = 100; i >= 1; i--) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("odd numbers from 1 to 100");
		for (int j = 1; j <= 100; j++) {
			if ((j % 2) != 0) {
				System.out.print(j + " ");
			}
		}

	}
}
