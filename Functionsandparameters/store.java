package Functionsandparameters;

public class store {
	void getsoap(int money)
	{
		System.out.println(money);
		System.out.println("soap purchased");
	}
	void getshampoo(int money) 
	{
		System.out.println(money);
		System.out.println("shampoo purchased");
	}
	

	public static void main(String[] args) {
		store obj1 =new store();
		obj1.getsoap(30);
		obj1.getshampoo(2);

	}

}
