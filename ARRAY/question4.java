//Get input for size on array
//Get input for each element in an array
//Find and print middle element in an array
package Day7;
import java.util.Scanner;
public class question4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size=scan.nextInt();
		int[]marks=new int[size];
		
		for(int i=0;i<=size-1;i=i+1) {
			marks[i]=scan.nextInt();
		}
		

	}

}
