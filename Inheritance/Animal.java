package Inheritance;

class Zoo{
	String name;
	int age;
	void makeSound() {
		System.out.println("Animal makes sound");
	}
}

class Dog extends Zoo{
	String breed;
	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}
	void fetch() {
		System.out.println("Dog is fetching");
	}
}

class cat extends Zoo{
	String color;
	@Override
	void makeSound() {
	  System.out.println("cat meows");
	}
	void climb() {
		System.out.println("Cat is climbing");
	}
}
public class Animal {

	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.name="dani";
		d1.age=4;
		d1.breed="huskey";
		d1.makeSound();
		d1.fetch();
		
		cat c1=new cat();
		c1.name="blacky";
		c1.age=4;
		c1.color="black";
		c1.makeSound();
		c1.climb();


	}

}


