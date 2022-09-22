package pack2;

class add
{
	void addss()    //Default specifier
	{
	System.out.println("Addition");
	}
	protected void subss() //protected-accessible inside and outside package also
	{
		System.out.println("subtraction");
	}
}

public class Addd extends add {

	public static void main(String[] args) {
		
		Addd obj=new Addd();
		obj.addss();
		obj.subss();
		

	}


}
