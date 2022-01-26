
import java.util.*; // import Scanner class

public class ColdputerScience {
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		
		int n = scnr.nextInt();
		int[] t = new int[n];
		
		int total = 0;
		
		for(int i = 0; i < n; i++)
		{
			t[i] = scnr.nextInt();
		}
		
		for(int i = 0; i < n; i++)
		{
			if (t[i] < 0)
			{
				total += 1;
			}
		}
		
		System.out.println(total);
	}
	// end main
}
// end class