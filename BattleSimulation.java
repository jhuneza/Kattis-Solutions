/*
 * Program Name:				BattleSimulation.java
 * Coder:						Llara
 * Date:						Feb. 4, 2022
 */

import java.util.Scanner; // import Scanner class

public class BattleSimulation {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String attack = scnr.next();
		char a[] = attack.toCharArray();
		
		char rake = 'R';
		char bite = 'B';
		char laser = 'L';
		
		//counter 
		String slice = "S";
		String kick = "K";
		String shield = "H";
		String combo = "C";
		
		for (int i = 0; i < a.length; i++)
		{
			int a2 = i+2; 
			int a1 = i+1;
			if ((a2<a.length) && (a1<a.length))
			{
				if ((a[i]==rake)&&(a[a2]==bite)&&a[a1]==laser)
				{
					System.out.print(combo);
					i+=2;
				}
				else if ((a[i]==rake)&&(a[a2]==laser)&&a[a1]==bite)
				{
					System.out.print(combo);
					i+=2;
				}
				else if ((a[i]==bite)&&(a[a2]==laser)&&a[a1]==rake)
				{
					System.out.print(combo);
					i+=2;
				}
				else if ((a[i]==bite)&&(a[a2]==rake)&&a[a1]==laser)
				{
					System.out.print(combo);
					i+=2;
				}
				else if ((a[i]==laser)&&(a[a2]==rake)&&a[a1]==bite)
				{
					System.out.print(combo);
					i+=2;
				}
				else if ((a[i]==laser)&&(a[a2]==bite)&&a[a1]==rake)
				{
					System.out.print(combo);
					i+=2;
				}
				else if (a[i]==rake)
				{
					System.out.print(slice);
				}
				else if (a[i]==bite)
				{
					System.out.print(kick);
				}
				else if (a[i] == laser)
				{
					System.out.print(shield);
				}
			}
			else {
					if (a[i]==rake)
				{
					System.out.print(slice);
				}
				else if (a[i]==bite)
				{
					System.out.print(kick);
				}
				else if (a[i] == laser)
				{
					System.out.print(shield);
				}
			}
		}
		
		System.out.println("");

				
		scnr.close();
	}
	// end main
}
// end class