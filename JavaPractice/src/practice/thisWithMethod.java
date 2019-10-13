package practice;

class Student3
{
	

	void n()
	{
		System.out.println("Hello N");
	}
	void m()
	{
		System.out.println("Hello M");
		this.n();//provides default "this" if not there
	}


}
public class thisWithMethod {

	public static void main(String[] args) {
		Student3 s1=new Student3();
		s1.m();


	}

}
