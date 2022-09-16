package javaoops;

class car
{
	void cars()
	{
		System.out.println("We have a veriety of cars");
	}
}

public class MethodOverriding extends car
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding obj=new MethodOverriding();
		obj.cars(); // It will call the local method(line no 20)

	}
	void cars()
	{
		super.cars();    // It will inherit the super class
		System.out.println("BMW is the best");
	}

}
