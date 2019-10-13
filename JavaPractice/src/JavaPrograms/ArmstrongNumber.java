package JavaPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=153,a,c=0;
		int temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);

		}
		if(temp==c)

			System.out.println(temp+" is an Armstrong number");
		else
			System.out.println(temp+" is not an Armstrong number");


	}

}
