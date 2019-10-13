package practice;

public class MethodReturnArray {

	static int[] get()
	{
		return new int[] {30,70,60};
	}
	public static void main(String[] args) {
		int a[]=get();
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);

	}

}
