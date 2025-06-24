package inheritance;
class animal{
	void eat() {
		System.out.println("it will eat");
	}
}
//sinle inheritance
class dog extends animal{
	void bark() {
		System.out.println("it will bark");
	}
}
//multilevel inheritance
class puppy extends dog  {
	void weep() {
		System.out.println("it will weep");
	}
}
//hierachical inheritance one super class - two sub classes
class cat extends animal{
	void meow() {
		System.out.println("it will meow");
	}
}
class cow extends animal{
	void moww() {
		System.out.println("it will moow");
	}
}

public class Single {

	public static void main(String[] args) {
	puppy obj=new puppy();
	cat obj1 = new cat();
	cow c = new cow();
	obj.eat();
	obj.bark();
	obj.weep();
	obj1.meow();
	c.moww();


	}

}
