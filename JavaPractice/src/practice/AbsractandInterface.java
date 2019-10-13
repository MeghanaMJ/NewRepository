package practice;

interface printable
{
	void read();
	void write();
	void show();
	void listen();
}

abstract class A1 implements printable
{
	public void write()
	{

		System.out.println("Writing...");
	}
}

abstract class B1 extends A1
{
	public void read()
	{
		System.out.println("Reading...");
	}
}

class C extends B1
{
	public void listen()
	{
		System.out.println("Listening...");
	}

	public void show()
	{
		System.out.println("Showing...");
	}
}
public class AbsractandInterface {

	public static void main(String[] args) {
		printable c1=new C();
		c1.listen();
		c1.read();
		c1.show();
		c1.write();

	}

}
