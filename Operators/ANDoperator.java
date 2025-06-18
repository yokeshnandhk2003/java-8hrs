package Operators;

public class ANDoperator {

	public static void main(String[] args) {
		boolean icecream = true;
		boolean hungry = true;
//		true && true = true
//		true && false= false
//		false && false=false
		if(icecream && hungry) {
			System.out.print("eat");
		}
		else {
			System.out.print("Don't eat");
		}

	}

}
