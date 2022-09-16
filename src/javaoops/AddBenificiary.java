package javaoops;

class login               //Single inheritance
{
	void verifylogin()
	{
		System.out.println("Login is verified");
	}
}
public class AddBenificiary extends login
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		AddBenificiary obj1=new AddBenificiary();
		obj1.verifylogin();
		obj1.verifybenificiary();
		

	}
	void verifybenificiary()
	{
		System.out.println("Benificiary is verified");
	}
}

