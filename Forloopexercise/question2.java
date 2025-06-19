//print square of numbers from 1 to 10
package Forloopexercise;

public class question2 {

	public static void main(String[] args) {
		System.out.println("Enter the number to square from 1 to 10:");
		for(int i=1;i<=10;i=i+1) {
			int square=i*i;
			System.out.println("square of " + i + " is : " + square);
		}

	}

}
