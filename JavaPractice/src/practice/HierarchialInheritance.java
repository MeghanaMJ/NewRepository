package practice;

class College
{
	void teach()
	{
		System.out.println("Teaching...");
	}
}

class Boys extends College
{
	void boycount()
	{
		System.out.println("Boys Count...");
	}
}

class Girls extends College
{
	void girlcount()
	{
		System.out.println("Girls Count...");
	}
}
public class HierarchialInheritance {

	public static void main(String[] args) {
		Girls g=new Girls();
				
			g.girlcount();
			//g.boycount();
			g.teach();
			
				

	}

}
