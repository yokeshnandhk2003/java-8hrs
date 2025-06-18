package forloopPractice;
//print all odd numbers from 1 to 50
public class question3 {
	public static void main (String args[]) {
		System.out.println("odd number from 1 to 50");
		for(int i=1;i<=50;i=i+1) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
}

