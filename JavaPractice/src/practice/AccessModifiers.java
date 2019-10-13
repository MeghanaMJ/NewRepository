package practice;

import org.omg.CORBA.PUBLIC_MEMBER;

//------PRIVATE-----------
/*class Test1
{
	private int a=10;
	private void msg()
	{
		System.out.println("msging...");
	}
}
public class AccessModifiers {

	public static void main(String[] args) {
		Test1 t=new Test1();
		System.out.println(t.a);
		t.msg();

	}

}*/

//--------DEFAULT--------------

/*class Test2
{
	int a=10;
	void msg()
	{
		System.out.println("msging...");
	}
}

public class AccessModifiers
{
	public static void main(String[] args)
	{
		Test2 t=new Test2();
		System.out.println(t.a);
		t.msg();

	}
}*/

//---------PROTECTED-----------

public class AccessModifiers
{
	protected int a=500;
	protected void msg()
	{
		System.out.println("displaying...");
	}
}

/*class AccessModifiers
{
	public static void main(String[] args)
	{
		Test3 t=new Test3();
		System.out.println(t.a);
		t.msg();
	}
}*/

//-----------PUBLIC-----------

/*public class Test4
{
	public int a=9000;
	public void disp()
	{
		System.out.println("pop up");
	}
}

public class sub 
{
	public static void main(String[] args)
	{
		Test4 t=new Test4();
		System.out.println(t.a);
		t.disp();
	}
}*/