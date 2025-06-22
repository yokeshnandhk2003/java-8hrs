package Functionsandparameters;

public class multi {
	void mul(int a,int b) 
	{
		System.out.println(a*b);
	}
	void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	void div(int a,int b)
	{
		System.out.print(a/b);
	}

	public static void main(String[] args) {
		multi obj1=new multi();
		obj1.mul(10,50);
		obj1.sub(20, 5);
		obj1.div(100, 2);
		

	}

}
