//June 11 2023

import java.util.Scanner;

public class fizzBuzz {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//inputs, div by X, div by Y, num of tests
		
		int x = scnr.nextInt();
		int y = scnr.nextInt();
		int num = scnr.nextInt();
		
		//if i is div by x, print fizz, if div by y, print buzz, if div by both, print fizzbuzz
		//else print i
		
		for (int i = 1; i <= num; i++) {
			if (i % x == 0) {
				if (i % y == 0)
				{
					System.out.println("FizzBuzz");
				}
				else
				System.out.println("Fizz");
			}
			else if (i % y == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}
}
