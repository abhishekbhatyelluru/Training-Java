package javaoops;
interface vehicle
{
	void cardetails();
}

public class InterfaceExample implements vehicle
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample obj=new InterfaceExample();
		obj.cardetails();

	}
	public void cardetails()
	{
		System.out.println("Car number is 123");
	}

}
