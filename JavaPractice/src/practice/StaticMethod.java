package practice;

class Student1
{
	int rollno;
	String name;
	static String college="PESIT";

	static void change()
	{
		college="JNNCE";
	}

	Student1(int r, String s)
	{
		rollno=r;
		name=s;
	}

	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
}
public class StaticMethod {
	public static void main(String[] args)
	{
		Student1.change();
		Student1 s1=new Student1(111,"Meghana");
		Student1 s2=new Student1(222,"Vinay");

		s1.display();
		s2.display();
	}

}
