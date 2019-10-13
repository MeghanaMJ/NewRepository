package practice;

class Student2
{
	int rollno;
	String name;
	float fee;

	Student2(int rollno,String name, Float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;

	}

	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}
}
public class thisWithVariable {

	public static void main(String[] args) {
		Student2 s1=new Student2(111,"Meg",600f);
		Student2 s2=new Student2(222,"Meghana",500f);
		s1.display();
		s2.display();


	}

}
