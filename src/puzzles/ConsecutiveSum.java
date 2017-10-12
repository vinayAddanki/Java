package puzzles;

import java.util.Scanner;

public class ConsecutiveSum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input: ");
		int n = sc.nextInt();
		int output = findConsecutiveSum(n);
		System.out.println("Output: " + output);
	}

	static int findConsecutiveSum(int N) {
		int start = 1, end = (N + 1) / 2, count = 0;
		while (start < end) {
			int sum = 0;
			for (int i = start; i <= end; i++) {
				sum = sum + i;
				if (sum == N) {
					count++;
					break;
				}
				if (sum > N)
					break;
			}
			sum = 0;
			start++;
		}
		return count;
	}

}
