package practice;

public class CopyArray {

	public static void main(String[] args) {
		char[] from= {'a','b','s','p','a','r','k','l','e','c','d'};
		char[] to=new char[7];
		System.arraycopy(from, 2, to, 0, 7);
		System.out.println(String.valueOf(to));


	}

}
