package practice;

class Animal
{
	void sleep()
	{
		System.out.println("Sleeping...");
	}
}
class Fish extends Animal
{
	void eat()
	{
		System.out.println("Eating...");
	}
}
class SingleInheritance {

	public static void main(String[] args) {
		Fish d=new Fish();
		d.sleep();
		d.eat();


	}

}
