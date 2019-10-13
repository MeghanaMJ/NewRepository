package practice;

class Animaly
{
	void eat()
	{
		System.out.println("eating...");
	}
}
class Doggy extends Animaly
{
	void eat()
	{
		System.out.println("Dog eating...");

	}
	void bark()
	{
		super.eat();
		System.out.println("barking...");
	}

}
public class SuperWithMethod {

	public static void main(String[] args) {

		Doggy d=new Doggy();
		d.bark();

	}

}
