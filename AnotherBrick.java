/*
 * Program Name:			AnotherBrick.java
 * Coder:					Llara
 * Date:					Feb. 4, 2022
 */

import java.util.*; // import Scanner class

public class AnotherBrick {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		int h = scnr.nextInt();
		int w = scnr.nextInt();
		int n = scnr.nextInt();
	
		int width = 0, height = 0;

		boolean complete = false;
		
		int i = 0;
		while (i < n)
		{
			int brick = scnr.nextInt();
			
			if (height < h)
			{
				width += brick;
				if (width == w)
				{
					height++;
					width = 0;
				}
				else if (width > w)
				{
					height = h + 1;
				}
				
				if (height == h)
				{
					complete = true;
				}
			}
			i++;
		}
		
		if (complete)
		{
			System.out.print("YES");
		}
		else 
		{
			System.out.print("NO");	
		}
		
		scnr.close();
	}
	// end main
}
// end class