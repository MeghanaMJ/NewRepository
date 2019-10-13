package practice;

//1st WAY==Without creating instance of object and using Static methods

/*class Addition
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a, int b,int c)
	{
		return a+b+c;
	}
}
public class MethodOverloadingWithNumOfArguments {

	public static void main(String[] args) {
		System.out.println(Addition.add(11,11));
		System.out.println(Addition.add(11, 11,11));

	}

}*/

//2nd WAY==Creating instance of objects and calling Constructor

class Addition
{
	Addition(int a,int b)
	{
	  System.out.println(a+b);
	}
	
	Addition(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
}

class MethodOverloadingWithNumOfArguments
{
	public static void main(String[] args) 
	{
		Addition a=new Addition(7,5);
		Addition a1=new Addition(4,4);
	}
	
}
