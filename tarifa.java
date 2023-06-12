//june 12 2023

import java.util.Scanner;

public class tarifa {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//num of initial mb
		int x = scnr.nextInt();
		//num of months
		int n = scnr.nextInt();
		//num of mb used per month
		int[] p = new int[n];
		int total = x;
		
		for (int i = 0; i < n; i++) {
			p[i] = scnr.nextInt();
			total = total - p[i] + x;
		}
		
		System.out.println(total);
	}
}
