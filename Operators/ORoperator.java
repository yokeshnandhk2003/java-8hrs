package Operators;

public class ORoperator {
	public static void main(String args[]) {
		boolean cricket=true;
		boolean football=false;
//		true or true=true
//		true or false=true
//		false or true=true
//		false or false =false

		if(cricket||football) {
			System.out.print("play");
		}
		else {
			System.out.print("Don't play");
		}
	}

}
