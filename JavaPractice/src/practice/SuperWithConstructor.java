package practice;

class A
{
	A()
	{
		System.out.println("Waving...");
	}
}
class B extends A
{
	B()
	{
		super();
		System.out.println("Walking...");
	}
}
public class SuperWithConstructor {

	public static void main(String[] args) {
		B b1=new B();
		
	}

}
