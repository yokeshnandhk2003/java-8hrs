//print all numbers between a and b divisible by 5
package Forloopexercise;
import java.util.Scanner;
public class question4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value for a:");
	    int a=scan.nextInt();
	    System.out.println("Enter the valu for b:");
	    int b=scan.nextInt();
	    System.out.println("Number b/w "+ a + "and"+ b +"divisible by 5");
	    for(int i=a;i<=b;i++) {
	    	if(i%5==0) {
	    		System.out.println(i);
	    	}
	    }

	}

}
