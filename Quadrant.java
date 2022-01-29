// https://open.kattis.com/problems/quadrant

import java.util.Scanner;
public class Quadrant {
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		
		int x = scnr.nextInt();
		int y = scnr.nextInt();
		
		if (x < 0)
		{
			if (y < 0)
			{
				System.out.print("3");
			}
			if (y > 0)
			{
				System.out.print("2");
			}
		}
		else if (x > 0)
		{
			if (y < 0)
			{
				System.out.print("4");
			}
			if (y > 0)
			{
				System.out.print("1");
			}
		}

		scnr.close();
	}
	
	// end main
}
// end class