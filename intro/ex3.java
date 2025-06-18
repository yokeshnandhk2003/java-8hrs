//Get input for 3 integer variables: a,b and c.now multiply all variables and store it in d.Now add all variables and store it in e. Now divide d by e.

package intro;
import java.util.Scanner;
public class ex3 {
	public static void main(String args[]) {
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = a*b*c;
		int e = a+b+c;
		System.out.println("sample output is "+d/e);
	}

}
