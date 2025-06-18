package Operators;
import java.util.Scanner;
public class question7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int maths=scan.nextInt();
		int tamil=scan.nextInt();
		int english=scan.nextInt();
		int science=scan.nextInt();
		int social=scan.nextInt();
		
		int Totalmark=maths+tamil+english+science+social;
		int avg=Totalmark/5;
		
		if(avg<35)
		{
			System.out.print("REQUIRED SPECIAL CLASS");
		}
		else {
			System.out.print("GOOD TO GO");
		}

	}

}
