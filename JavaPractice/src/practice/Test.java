package practice;

public class Test
{
	static void min(int a[])
	{
		int min=a[0];
		for(int i=1;i<a.length;i++)
		
			if(min>a[i])
			
				min=a[i];
		System.out.println(min);
		
	}

public static void main(String[] args) {
		int a[]= {10,20,30};
		min(a);

	}

}
