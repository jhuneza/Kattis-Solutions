/*
 * Program Name:				ProblemDWERTYU.java
 * Coder:						Llara
 * Date:						Feb. 4, 2022
 */

import java.util.Scanner; // import Scanner class

public class ProblemDWERTYU {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String keys = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
		
		while (scnr.hasNext())
		{
			String input = scnr.next();
			
			for (int i = 0; i < input.length(); i++)
			{
				String b = input.substring(i, i+1);
				
				if (keys.contains(b))
				{
					System.out.print(keys.charAt(keys.indexOf(b)-1));
				}
			}
			System.out.print(" ");
		
		}
		scnr.close();
	}
	// end main
}
// end class