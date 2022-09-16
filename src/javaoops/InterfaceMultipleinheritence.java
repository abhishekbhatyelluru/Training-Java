package javaoops;
interface laptop
{
	void lapdetails(); //jvm creates public abstract void lapdetails() 
}
interface desktop
{
	void deskdetails();
}

public class InterfaceMultipleinheritence implements laptop,desktop
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceMultipleinheritence obj=new InterfaceMultipleinheritence();
		obj.lapdetails();
		obj.deskdetails();

	}
	public void lapdetails()
	{
		System.out.println("My laptop is Dell");
	}
	public void deskdetails()
	{
		System.out.println("My Desktop is Hp");
	}

}
