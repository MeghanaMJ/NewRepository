package JavaPrograms;

public class PrimeUsingMethod {
	static int n,temp=0,i;
	public static void main(String[] args) {
		checkPrime(1);
		checkPrime(2);
		checkPrime(3);
		checkPrime(6);

	}

	private static void checkPrime(int n) {
		if(n==0||n==1)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			for(i=2;i<=n-1;i++) 
			{
				if(n%i==0)
				{
					temp=temp+1;
				}
			}
			if(temp>0)
				System.out.println(n+" is not a prime number");
			else
				System.out.println(n+" is a prime number");

		}


	}

}
