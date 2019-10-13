package JavaPrograms;

public class FibonacciWithRecursion {
	static int n1=0,n2=1,n3,i;


	public static void main(String[] args)
	{
		int count=10;
		System.out.print(n1+" "+n2);
		PrintFibonacci(count-2);	
	}

	 static void PrintFibonacci(int count) {
		 if(count>0)
		 {
			 n3=n1+n2;
			 System.out.print(" "+n3);
			 n1=n2;
			 n2=n3;
			 PrintFibonacci(count-1);
			 
		 }
		
		
	}

}
