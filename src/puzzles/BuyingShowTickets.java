package puzzles;

import java.io.IOException;
import java.util.Scanner;

public class BuyingShowTickets {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input array size:");
		int n = sc.nextInt();
		int tickets[] = new int[n];
		System.out.println(tickets.length + " Input array elements:");
		for (int i = 0; i < n; i++) {
			tickets[i] = sc.nextInt();
		}
		System.out.println("Position in array:");
		int p = sc.nextInt();
		long r = waitingTime(tickets, p);
		System.out.println("Output: " + r);
	}

	static long waitingTime(int[] tickets, int p) {

		int sum = 0, count = 0, ifcount = 0;
		int temp[] = new int[tickets.length];
		for (int num : tickets) {
			sum = sum + num;
		}
		for (int i : temp) {
			temp[i] = 0;
		}
		for (int i = 0; i < tickets.length; i++) {
			for (int j = 0; j < temp.length; j++) {
				if (i >= 1 && tickets[j] == temp[j]) {
					ifcount++;
				} else {
					temp[j] = temp[j] + 1;
					count++;
				}
				if (j == p && tickets[j] == temp[j]) {
					return count;
				}
			}
		}
		return 0;
	}

}
