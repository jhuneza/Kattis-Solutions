
import java.util.Scanner;

public class FinalExam {
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		
		int n = scnr.nextInt();
		int total = 0;
		String answer = scnr.nextLine();
		
		for (; n > 0 ; n--)
		{
			String answer2 = scnr.nextLine();
			if (answer.equals(answer2))
			{
				total+=1;
			}
			
			answer = answer2;
		}
		
		System.out.println(total);
		
	}	//end main
}	//end class
