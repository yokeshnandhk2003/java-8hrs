//Create a function called getname(),which should return your name,
//create a function called getphone()which should return you the phone number
package Return;

public class zenitsu {
	String getname()
	{
		return "yoki";
	}
	
	String getphone()
	{
		return "9876543210";
	}
	
	String getaddress()
	{
		return "196,kovilstreet,UKlondon";
	}

	public static void main(String[] args) {
		zenitsu obj1=new zenitsu();
		String name=obj1.getname();
		System.out.println(name);
	    String phone=obj1.getphone();
	    System.out.println(phone);
	    String address=obj1.getaddress();
	    System.out.println(address);

	}

}
