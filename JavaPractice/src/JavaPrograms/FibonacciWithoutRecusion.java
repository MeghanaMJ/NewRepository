package JavaPrograms;

public class FibonacciWithoutRecusion {

	public static void main(String[] args) {
		int n=4,fact=1;
		fact=factorial(n);
		System.out.println("Factorial is "+fact);
	}

	static int factorial(int n) {
		if(n==0)
			return 1;
		else
			return (n*factorial(n-1));

	}
}

