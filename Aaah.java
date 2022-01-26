//https://open.kattis.com/problems/aaah
import java.util.*; // import Scanner class

public class Aaah {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		
		String jon = scnr.nextLine();
		String doctor = scnr.nextLine();
		

		if (jon.length() >= doctor.length())
		{
			System.out.println("go");
		}
		else {
			System.out.println("no");
		}

		scnr.close();
	}
	// end main
}
// end class
