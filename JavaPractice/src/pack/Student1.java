package pack;

class Student
{
	int number;
	String name;
	float fee;

	int squre(int number)
	{
		this.number=number;
		int n=number*number;
		return n;
	}

	void record(int id,String name,float fee)
	{
		System.out.println(id+" "+name+" "+fee);
	}

	void display()
	{
		System.out.println(squre(number));
	}
}
public class Student1 {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.squre(3);
		s1.display();
	}

}
