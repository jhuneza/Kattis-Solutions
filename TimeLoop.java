
import java.util.*; // import Scanner class

public class TimeLoop {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		int num = scnr.nextInt();
		
		for (int i = 0; i < num; i++)
		{
			System.out.printf("%d Abracadabra\n", i+1);
		}

		scnr.close();
	}
	// end main
}
// end class