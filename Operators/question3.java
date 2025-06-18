//Get input for a number and check whether it is divisible by both 3 and 5 or not.
//if yes then print,the number is divisible by 3 and 5 print the number is not divisible by 3 and 5?
package Operators;
import java.util.Scanner;
public class question3 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int num=scan.nextInt();
	
		if (num%3==0){
		if(num%5==0) {
			System.out.print("The num is divisible by 3 and 5");
		}
		}
		else {
			System.out.print("Not divisible by 3 and 5");
		}
		
				
	}
         
}
