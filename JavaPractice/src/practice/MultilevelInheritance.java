package practice;

class School
{
	void teach()
	{
		System.out.println("Teaching...");
	}
}

class Students extends School
{
	void learn()
	{
		System.out.println("Learning...");
	}
}

class Cleaner extends Students
{
	void clean()
	{
		System.out.println("Cleaning...");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Cleaner c1=new Cleaner();

		c1.clean();
		c1.learn();
		c1.teach();

	}

}
