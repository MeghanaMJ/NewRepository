package JavaPrograms;

public class FactorialRecursion {

	public static void main(String[] args)
	{
		int fact=1,n=4;
		fact=factorial(n);
		System.out.println(fact);
	}

	static int factorial(int n) {
		if(n==0) 
			return 1;
			else
				return n*factorial(n-1);
		



	}
}
