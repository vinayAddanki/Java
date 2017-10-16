package puzzles;

public class LargestSubsetSum {

	public static void main(String[] args) {

		int array[] = new int[] { -2, -5, 6, -2, -3, 1, 5, -6 };
		int output = maxSubsetSum(array);
		System.out.println(output);
	}

	static int maxSubsetSum(int[] array) {
		if (array.length == 0)
			return 0;
		int maxSum = array[0];
		int arr = array[0];
		for (int i = 1; i < array.length; i++) {
			if (arr < 0) {
				arr = array[i];
			} else {
				arr += array[i];
			}
			
			maxSum = maxSum > arr ? maxSum : arr;
			System.out.println(maxSum);
		}
		return maxSum;
	}

}
