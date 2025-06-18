package Operators2;
//print the number which are divisible by both 3 and 5
//range 1 to 100
import java.lang.System;
import java.util.Scanner;
public class question5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value a:");
		int a = scan.nextInt();
		System.out.print("Enter value b:");
		int b = scan.nextInt();
		System.out.println("Num divisible by both 3 and 5 "+ a + " and " + b + " are ");
		boolean range=true;
		
		for(int i=a;i<=b;i=i+1) {
			if(i%3==0 && i%5==0) {
             System.out.print(i);
             range=false;
			}
			
		}	
		
		if(range){
			System.out.print("no num divisible by 3 and 5");
		}
	
			
		
		}
}