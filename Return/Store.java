package Return;

public class Store {

	int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}

	public static void main(String[] args) {
		Store obj1=new Store();
		int sum=obj1.sum(12,20);
		System.out.print(sum);
         
	}

}
