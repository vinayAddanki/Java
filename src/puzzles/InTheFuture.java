package puzzles;

import java.io.IOException;
import java.util.Scanner;

public class InTheFuture {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Asha solved problems:");
		int A = sc.nextInt();
		System.out.println("Kelly solved problems:");
		int K = sc.nextInt();
		System.out.println("No of problems ahead:");
		int P = sc.nextInt();
		System.out.println("Output: " + minNum(A, K, P));
	}

	static int minNum(int A, int K, int P) {

		int count = 0, a = A, k = K;
		boolean condition = true;
		while (condition) {
			if (count == 0)
				a = A + P;
			count++;
			if (k > a) {
				condition = false;
				break;
			} else if (count >= 1) {
				k = k + K;
				a = a + A;
			}
		}
		return count;
	}
}