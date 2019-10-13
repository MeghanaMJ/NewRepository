package JavaPrograms;

import java.util.Scanner;

public class PrimeNumberEasy {

	public static void main(String[] args) {
		//int n=5,
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n==0||n==1)
		{
			System.out.println(n+" is not a prime number");
		}
		else
		{
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				temp=temp+1;
			}
		}
		}
		if(temp>0)
		
			System.out.println(n+" is not a prime number");
			else
				System.out.println(n+" is a prime number");
		

	}

}
