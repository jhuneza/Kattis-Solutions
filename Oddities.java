// https://open.kattis.com/problems/oddities

import java.util.Scanner;

public class Oddities {
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		
		int n = scnr.nextInt();
		int[]m = new int[n];
		
		for (int i = 0; i < n; i++)
		{
			m[i] = scnr.nextInt();
		}
		
		for (int i = 0; i < n; i++)
		{
			if (m[i]%2==0) 
			{
				System.out.printf("%d is even\n", m[i]);
			}
			else {
				System.out.printf("%d is odd\n", m[i]);	
			}
		}
	}
}
// end class