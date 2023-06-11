import java.util.Scanner;

public class WhichIsGreater {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//input 2 ints
		int num1 = scnr.nextInt();
		int num2 = scnr.nextInt();
		
		//output 1 if num1 > num2
		if (num1 > num2) {
			System.out.println("1");
		}
		
		//else 0
		else {
			System.out.println("0");
		}

	}

}
