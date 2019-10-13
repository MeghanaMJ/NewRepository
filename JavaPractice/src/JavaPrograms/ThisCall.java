package JavaPrograms;

public class ThisCall {

	ThisCall abc;
	void X(ThisCall abc) {
		this.abc=abc;

	}
	void display() {
		System.out.println(abc.data+" "+abc.name+" "+abc.number+" "+abc.salary);
	}
	void Method() {

		X(this);

	}
	int data=10;
	int number=20;
	String name="Adarsh";
	int salary=1000;

	public static void main(String[] args) {

		ThisCall tc = new ThisCall();
		tc.Method();
		tc.display();


	}

}
