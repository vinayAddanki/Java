package puzzles;

import java.util.Scanner;

public class FindTheWinner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements you want in Andrea array:");
		int n = sc.nextInt();
		String s, output = null;
		int andrea[] = new int[n];
		System.out.println("Enter Andrea array elements:");
		for (int i = 0; i < n; i++)
			andrea[i] = sc.nextInt();
		System.out.println("Enter no. of elements you want in Maria array:");
		int m = sc.nextInt();
		int maria[] = new int[m];
		System.out.println("Enter Maria array elements:");
		for (int i = 0; i < m; i++)
			maria[i] = sc.nextInt();
		System.out.println("Enter game string:");
		s = sc.next();
		output = winner(andrea, maria, s);
		System.out.println("Output: " + output);
	}

	static String winner(int[] andrea, int[] maria, String s) {

		int andreaScore = 0, mariaScore = 0;
		if (s.equals("Even")) {
			for (int i = 0; i < andrea.length; i += 2) {
				mariaScore = mariaScore + (maria[i] - andrea[i]);
				andreaScore = andreaScore + (andrea[i] - maria[i]);
			}
		} else if (s.equals("Odd")) {
			for (int i = 1; i < andrea.length; i += 2) {
				mariaScore = mariaScore + (maria[i] - andrea[i]);
				andreaScore = andreaScore + (andrea[i] - maria[i]);
			}
		}
		if (andreaScore == mariaScore) {
			return "Tie";
		} else if (andreaScore > mariaScore) {
			return "Andrea";
		} else {
			return "Maria";
		}
	}

}
