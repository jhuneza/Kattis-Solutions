
import java.util.*; // import Scanner class

public class reverse {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int n = scnr.nextInt();
		
		int[] m = new int[n];
		
		for (int i = 0; i < n; i++) {
			m[i] = scnr.nextInt();
		}
		
		for (int i = n-1; i >= 0; i--) {
			System.out.println(m[i]);
		}
	}
}
