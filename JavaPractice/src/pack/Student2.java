package pack;

class Add
{
	int a,b;

	int addition(int a,int b)
	{
		return a+b;
	}

	float addition(float a,float b)
	{
		return a+b;
	}

	void display()
	{
		System.out.println();
	}

}
public class Student2 {

	public static void main(String[] args) {
		Add a1=new Add();
		a1.addition(12, 12);
		a1.addition(12.0f, 12.0f);

		//a1.display();

	}

}
