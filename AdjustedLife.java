
import java.util.*; // import Scanner class

public class AdjustedLife {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		double n = scnr.nextDouble();	//num of cases
		double q, y;	// q = quality of life, y = num of years
		
		// printf %.3f
		
		double QOL = 0; 
		for (int i = 0; i < n; i++)
		{
			q = scnr.nextDouble();
			y = scnr.nextDouble();
			QOL += q*y;
		}
		
		System.out.printf("%.3f", QOL);
	}
}
// end class