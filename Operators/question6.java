package Operators;
import java.util.Scanner;
public class question6 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int score=scan.nextInt();
		if(score<50) {
			System.out.print("You need to improve");
		}
		else if(score==50||score>50 && score<70)
			System.out.print("Good job");
		else
		{
			System.out.print("Excellent performance!");
		}
	}

}
