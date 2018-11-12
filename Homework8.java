public class Homework8 {

	/* Finish the constructor and create any necessary instance
	 * variables. A Homework8 object should have an array that
	 * holds n int values
	 */
	public Homework8(int n) {
		int[] arr = new int[n];
	}

	/* Return the stored array
	 */
	public int[] problem1() {
		return arr[];
	}

	/* Fill the stored array with the provided int
	 */
	public void problem2(int n) {
		for (int i = 0; i < n; i++) {
			arr[i] = i * i;
		}
	}

	/* Fill the stored array. The first value should be
	 * n, the second n-1, the third n-2, etc.
	 */
	public void problem3(int n) {
		for (int i = 0; i < n; i++) {
			arr[i] = n - 1;
		}
	}

	/* Find and return the maximum value in the
	 * provided array
	 */
	public int problem4(double[] arr) {
		double largest = arr [0];
		for (int i = 1; i < n; i ++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
	}

	/* Find and return the index of num in the
	 * provided array
	 */
	public int problem5(int[] arr, int num) {
		int pos = 0;
		while (pos < arr.length) {
			if (arr[pos] == num) {
				return arr[pos];
			} else {
				pos ++;
			}
		}
	}

}
