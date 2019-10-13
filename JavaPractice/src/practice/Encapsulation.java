package practice;

class Studnt
{
	private int id;
	private String name;
	private float fee;
	
	public int get_id() 
	{
		return id;
	}
	
	public String get_name()
	{
		return name;
	}
	
	public float get_fee()
	{
		return fee;
	}
	
	public void set_id(int id)
	{
		this.id=id;
	}
	
	public void set_name(String name)
	{
		this.name=name;
	}
	
	public void set_fee(float fee)
	{
		this.fee=fee;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		Studnt s=new Studnt();
		s.set_id(111);
		s.set_name("Meghana");
		s.set_fee(7000f);
		
		System.out.println(s.get_id()+" "+s.get_name()+" "+s.get_fee());


	}

}
