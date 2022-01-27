// https://open.kattis.com/problems/autori

import java.util.Scanner;

public class Autori {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String[] word = scnr.nextLine().split("-");
		
		for (int i = 0; i < word.length; i++)
		{
			System.out.print(word[i].charAt(0));
		}
	}
	// end main
}
// end class