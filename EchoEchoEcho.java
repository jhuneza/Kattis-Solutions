
import java.util.*; // import Scanner class

public class EchoEchoEcho {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String word = scnr.nextLine();
		
		System.out.print(word + " " + word + " " + word);
		
		scnr.close();
	}
	// end main
}
// end class