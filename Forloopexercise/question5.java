//find factorial of a number n
package Forloopexercise;
import java.util.Scanner;
public class question5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a num to find its factorial:");
		int n=scan.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
		  fact=fact*i;
	}
       System.out.println("factorial of "+ n + " is: " + fact);
   }
}


