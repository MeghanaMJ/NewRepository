package practice;

class Bank
{
	int ROI()
	{
		return 0;
	}
}
class SBI extends Bank
{
	int ROI()
	{
		return 8;
	}
}
class Axis extends Bank
{
	int ROI()
	{
		return 10;
	}
}
class ICICI extends Bank
{
	int ROI()
	{
		return 7;
	}
}
public class MethodOverridingBank {

	public static void main(String[] args) {
		SBI s=new SBI();
		Axis a=new Axis();
		ICICI i=new ICICI();

		System.out.println(s.ROI());
		System.out.println(a.ROI());
		System.out.println(i.ROI());
	}

}
