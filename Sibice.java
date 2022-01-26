
import java.util.Scanner; // import Scanner class

public class Sibice {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int n = scnr.nextInt();
		int w = scnr.nextInt();
		int l = scnr.nextInt();
		int h = (int)Math.sqrt((l*l)+(w*w));
		
		int[] match = new int[n];
		for (int i = 0; i < n; i++) {
			match[i] = scnr.nextInt();
		}
		
		
		for (int i = 0; i < n; i++) {
			if (n <= 2 && match [i] < h)
			{
				System.out.println("DA");	
			}
			else if (match[i] <= h)
			{
				System.out.println("DA");
			}
			else 
			{
				System.out.println("NE");
			}
		}
	
	}
}
// end class