package Return;
import java.util.Scanner;
public class School {
	String passorfail(int score) 
	{
		if(score<34) {
			return "fail";
		}
		else {
			return "pass";
		}
	}

	public static void main(String[] args)
	{   
		Scanner scan=new Scanner(System.in);
		School obj1=new School();
		int total_mark=scan.nextInt();
		String result=obj1.passorfail(total_mark);
		System.out.print(result);

	}

}
