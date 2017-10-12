package puzzles;

import java.util.Scanner;

public class PsychometricTesting {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input scores array size:");
		int n = sc.nextInt();
		int scores[] = new int[n];
		System.out.println("Enter " + scores.length + " scores:");
		for (int i = 0; i < n; i++) {
			scores[i] = sc.nextInt();
		}
		System.out.println("Input Limit array size:");
		int m = sc.nextInt();
		int output[] = new int[m];
		int lowerLimits[] = new int[m];
		System.out.println("Enter " + lowerLimits.length + " lowerLimits:");
		for (int i = 0; i < m; i++) {
			lowerLimits[i] = sc.nextInt();
		}
		int upperLimits[] = new int[m];
		System.out.println("Enter " + upperLimits.length + " upperLimits:");
		for (int i = 0; i < m; i++) {
			upperLimits[i] = sc.nextInt();
		}

		output = jobOffers(scores, lowerLimits, upperLimits);
		for (int i = 0; i < m; i++) {
			System.out.print(output[i] + " ");
		}
	}

	static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {

		int k = 0, count = 0, result[] = new int[lowerLimits.length];
		for (int i = 0; i < lowerLimits.length; i++) {
			for (int j = lowerLimits[i]; j <= upperLimits[i]; j++, k++) {
				if (k < scores.length && scores[k] >= j && scores[k] <= upperLimits[i]) {
					count++;
				}
			}
			result[i] = count;
			k = 0;
			count = 0;
		}
		return result;
	}

}
