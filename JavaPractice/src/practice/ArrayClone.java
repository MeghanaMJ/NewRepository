package practice;

public class ArrayClone {

	public static void main(String[] args) {
		int[] a= {4,5,6};

		System.out.println("Print original array: ");

		for(int i:a)
			System.out.println(i);

		System.out.println("Print cloned array: ");

		int ca[]=a.clone();

		for(int i:ca)
			System.out.println(i);
		
		System.out.println("Are both arrays equal?");
		
		System.out.println(a==ca);

	}

}
