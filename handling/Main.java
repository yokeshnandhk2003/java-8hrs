package handling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       int a=0;
       int b=0;
       int c=0;
       try {
        a = scan.nextInt();
        b = scan.nextInt();
        c =0;
        c=a/b;
       }
       catch(ArithmeticException e){
    	   System.out.println("Arithmetic Expection, Please Retry " + e);
       }
       catch(InputMismatchException e) {
    	   System.out.println("InputMismatchException");
       }
       System.out.println("result : " +c);
	}

}
