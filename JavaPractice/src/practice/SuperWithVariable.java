package practice;

class Animal
{
	String name="Meghana";
}
class Dog extends Animal
{
	String name="Vinay";

	void display()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
}
public class SuperWithVariable {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.display();



	}

}
