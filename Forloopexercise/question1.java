//print multiplication table of number(example:table of 7)
package Forloopexercise;
import java.util.Scanner;
public class question1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to print multiplication table of number:");
		int num=scan.nextInt();
		System.out.println("print multiplication table of number " + num);
		for(int i=1;i<=10;i=i+1) {
			int result= num*i;
			System.out.println(num+" X "+ i +" = " + result );
		}
		

	}

}
