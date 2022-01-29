
import java.util.*; // import Scanner class

public class SolvingForCarrots {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		int n = scnr.nextInt();
		int p = scnr.nextInt();
		
		String d = "";
		
		for (int i = 0; i < n; i++)
		{
			d = scnr.nextLine();
		}

		System.out.println(p);
		
		scnr.close();
	}
	// end main
}
// end class