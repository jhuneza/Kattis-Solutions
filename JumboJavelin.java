/*
 * Program Name:		JumboJavelin.java
 * Purpose:				Find javelin length
 * Coder:				Llara Bermudez
 * Date:				Jan. 20, 2022
 */

import java.util.Scanner;

public class JumboJavelin {
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		int n = scnr.nextInt();
		int i =0;
		int rodLength = 0;
		do {
			int l = scnr.nextInt();
			
			rodLength += l;
			i++;
			
		}while (i < n);
		
		System.out.println(rodLength - (n - 1));
		
		scnr.close();
	}
}
