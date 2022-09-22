package pack1;

class carss
{
	private int carno=123;
	private void detailscar()     //private-onlu accessible inside the class
	{
		System.out.println("Engine no is 325");
	}
	void carcaompany()     //Default-accessible anywhere inside the package
	{
		System.out.println("Car is BMW");
	}
}
public class PrivateExample extends carss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateExample obj=new PrivateExample();
		//System.out.println(obj.carno);     //Private variable so compilation error...OUT OF SCOPE AS ITS PRIVATE
		//obj.detailscar();      //private method so it will give error
		obj.carcaompany();      //Default method...It will be executed
	
	}

}
