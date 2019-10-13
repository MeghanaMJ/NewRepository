package JavaPrograms;

public class PalindromeNumber1 {

	public static void main(String[] args) {
		int n=545,sum = 0,r,temp;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		
			System.out.println(sum +" is a palindrome number");
		
		else
			System.out.println(sum +" is not a palindrome number");
		

	}

}
