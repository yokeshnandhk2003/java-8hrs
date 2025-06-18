package Operators;
import java.util.Scanner;
//find out whether num is divisible by 5 or not?
public class question4 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num%5==0 && num%3==0) {
			System.out.print("yes");
		}
		else {
			System.out.print("no");
		}
	}

}
