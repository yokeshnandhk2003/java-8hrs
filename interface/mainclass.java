package practice;
 abstract class Animal{
	 String name;
	 
	 Animal(String name)
	 {
		this.name=name; 
	 }
	 abstract void makesSound();
 }
 
 class dog extends Animal{
	 
	 dog(String name)
	 {
		 super(name);
	 }
	 @Override
	void makesSound() {
		System.out.println("lol lol");
	}
 }
 
  class cat extends Animal{
	  cat(String name)
	  {
		  super(name);
	  }
	  void makesSound() {
		 System.out.println("meow meow");

	  }
 	
	}
 
public class mainclass {

	public static void main(String[] args) {
		dog d = new dog("bobby");
		System.out.println(d.name);
		d.makesSound();
		cat c = new cat("jimmy");
		System.out.println(c.name);
		c.makesSound();

	}

}
