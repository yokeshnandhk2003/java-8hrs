package Operators;
import java.util.Scanner;
public class question8 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the traffic light color: ");
		String color = scan.nextLine();
		
		if (color.equals("red")) {
			System.out.print("Stop");
		}
		else if(color.equals("yellow")) {
			System.out.print("Get ready");
		}
		else if(color.equals("Green")) {
			System.out.print("Go");
		}
		
	}

}
