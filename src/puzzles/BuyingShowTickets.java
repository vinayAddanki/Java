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

		int time = 0;
		while (tickets[p] != 0) {
			if (tickets[0] > 0) {
				tickets[0] = tickets[0] - 1;
				time++;
			}
			int n, temp = tickets[0];
			n = tickets.length;
			for (int i = 0; i < n - 1; i++)
				tickets[i] = tickets[i + 1];
			tickets[n - 1] = temp;
			p = (p + n - 1) % n;
		}
		return time;
	}

}
