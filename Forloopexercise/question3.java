//print numbers from n to 1(reverse order)
package Forloopexercise;
import java.util.Scanner;
public class question3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n= scan.nextInt();
		for(int i=n;i>=1;i=i-1) {
			System.out.println(i);
		}

	}

}
