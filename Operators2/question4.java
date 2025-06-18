package Operators2;
//print even number between 1 to 10 using for loop and if else.
public class question4 {

	

	public static void main(String[] args) {
		int evencount=0;
		int oddcount=0;
		for(int i=1;i<=10;i=i+1)
		
		if(i%2==0) 
		
		{
			evencount=evencount+1;
     
		}
		else {
			oddcount=oddcount+1;
		}
	
		  System.out.println(evencount);
		  System.out.print(oddcount);
		 	
		}
	}

