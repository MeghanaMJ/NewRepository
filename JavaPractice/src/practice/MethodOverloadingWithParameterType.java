package practice;

class Additions
{
	static int add(int a,int b)
	{
		return a+b;
	}
	
	static double add(double a,double b)
	{
		return a+b;
	}
	
}
public class MethodOverloadingWithParameterType {

	public static void main(String[] args) {
		System.out.println(Additions.add(11,11));
		System.out.println(Additions.add(17.9,16.5));

	}

}
