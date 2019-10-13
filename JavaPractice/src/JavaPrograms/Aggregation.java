package JavaPrograms;

class Address
{
	String City;
	String State;
	String Country;


	public Address(String City,String State,String Country)
	{
		this.City=City;
		this.State=State;
		this.Country=Country;
	}
}

class Employee
{
	int id;
	String name;
	Address address;

	public Employee(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}


	public void display()
	{
		System.out.println(id+" "+name);
		System.out.println(address.City+" "+address.State+" "+address.Country);
	}
}
public class Aggregation {

	public static void main(String[] args) {
		Address address1=new Address("Bng","Karnataka","India");
		Address address2=new Address("smg", "Karnataka","India");

		Employee e=new Employee(123,"Meghana",address1);
		Employee e2=new Employee(345,"MJ",address2);

		e.display();
		e2.display();
		System.out.println("Successful");

	}

}
