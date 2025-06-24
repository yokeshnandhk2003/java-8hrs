package practice;
interface Readable{
	void read();
}
interface Writable{
	void write();
}
interface Storable{
	void store();
}
class notes implements Readable,Writable,Storable{

	@Override
	public void store() {
		System.out.println("English");
		
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Maths");
		
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("Tamil");
		
	}
	
}
public class mainclass3 {

	public static void main(String[] args) {
		notes n=new notes();
		n.write();
		
	    notes r= new notes();
	    r.read();
	    
	    notes s=new notes();
	    s.store();
		

	}

}
