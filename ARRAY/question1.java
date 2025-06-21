//Create an integer array Get input for 5 numbers and print their sum or total.
package Day7;
import java.util.Scanner;
public class question1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[]marks= new int[5];
        
		marks[0]=scan.nextInt();
		marks[1]=scan.nextInt();
		marks[2]=scan.nextInt();
		marks[3]=scan.nextInt();
		marks[4]=scan.nextInt();
		
		System.out.println(marks[0]+marks[1]+marks[2]+marks[3]+marks[4]);
		
	}

}
