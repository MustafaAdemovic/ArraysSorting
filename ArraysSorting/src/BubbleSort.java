public class BubbleSort {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 3, 6, 2, 7, 3, 8, 4, 9, 10, 14, 13, 12, 11 };

		printArray(array);// metod write unsorted array
		System.out.println();
		bubbleSort(array);// metod assorted array from smallest to the
							// largest, and using metod printArray write
							// assorted array
		printArray(array);

	}

	private static void bubbleSort(int[] array1) {

		for (int i = 0; i < array1.length; i++) {
			for (int j = 1; j < array1.length - 1; j++) {
				if (array1[j] < array1[j - 1]) {
					int temp = array1[j - 1];
					array1[j - 1] = array1[j];
					array1[j] = temp;

				}
			}
		}
	}

	private static void printArray(int[] array1) {

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
	}

}
