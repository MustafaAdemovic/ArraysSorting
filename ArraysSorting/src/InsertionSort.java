public class InsertionSort {

	public static void main(String[] args) {
		int[] array = new int[] { 3, 5, 2, 4, 1 };
		printArray(array);// metod write unsorted array

		System.out.println();
		insertionSort(array);// metod assorted array from smallest to the
								// largest, and using metod printArray write
								// assorted array
		printArray(array);

	}

	private static void insertionSort(int[] array1) {
		for (int i = 0; i < array1.length; i++) {
			int temp = array1[i];
			int j = i;
			while (j > 0 && temp < array1[j - 1]) {
				array1[j] = array1[j - 1];
				j--;
			}
			array1[j] = temp;
		}

	}

	public static void printArray(int[] array1) {
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
	}

}
