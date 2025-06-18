//Get input for 3 variables:Name,score,department.Let the user enter the score for 100 marks,you convert it for 10 and print it.

package intro;
import java.util.Scanner;
public class ex4 {
	public static void main(String args[]) {
 Scanner scan = new Scanner(System.in);
 String name = scan.nextLine();
 double score = scan.nextDouble();
 scan.nextLine();
 String Dept = scan.nextLine();
 
 System.out.println("My name is "+name);
 System.out.println("My score is "+score/10);
 System.out.println("My department is "+Dept);
 
 
	}
 
}
