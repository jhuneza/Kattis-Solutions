
import java.util.*; // import Scanner class

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int x = scnr.nextInt();
		int y = scnr.nextInt();
		int n = scnr.nextInt();
		
		for (int i = 0; i < n; i++)
		{
			if ((i+1) % x != 0 && (i+1) % y != 0)
			{
				System.out.println(i+1);
			}
			else if ((i+1)% x == 0 && (i+1)% y != 0)
			{
				System.out.println("Fizz");
			}
			else if ((i+1)% y == 0 &&(i+1)% x != 0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println("FizzBuzz");
			}
		}
		
		scnr.close();
	}
	// end main
}
// end class