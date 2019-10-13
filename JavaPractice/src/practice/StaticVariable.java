package practice;

class Student
{
	int rollno;
	String name;
	static String college="PESIT";


	Student(int r,String s)
	{
		rollno=r;
		name=s;
	}

	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
}
	public class StaticVariable {


		public static void main(String[] args) {
			Student s1=new Student(111,"Ram");
			Student s2=new Student(222,"shyam");

			s1.display();
			s2.display();

		}

	}

