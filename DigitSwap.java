import java.util.Scanner;

public class DigitSwap {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int num1 = scnr.nextInt();
		//int num2 = scnr.nextInt();
		int reversedNum = 0;
		
		while (num1 != 0) {
			reversedNum = reversedNum * 10 + num1 % 10;
			num1 = num1/10;
		}
		
		System.out.println(reversedNum);
//		
//		if(num2 == reversedNum) {
//			System.out.println("yes");
//		}
/*		else {
			System.out.println("no");
		}
*/
	}
}
