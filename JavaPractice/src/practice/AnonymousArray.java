package practice;


public class AnonymousArray {
	static void print(int a[])
	{
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

	public static void main(String[] args) {
		print(new int[] {10,50,90});

	}

}
