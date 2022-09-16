package javaoops;

abstract class employee
{
	abstract void details();  //No difinition
	void name()
	{
		System.out.println("Company name is Evry");
	}
	
}
public class AbtractExample extends employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbtractExample obj=new AbtractExample();
		obj.details();
		obj.name();

	}
	void details()
	{
		System.out.println("Employee Id is 123");
	}

}
