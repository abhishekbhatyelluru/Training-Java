package pack1;

public class PackageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PackageExample obj=new PackageExample();
		obj.evenodd(10);
		

	}
	public int evenodd(int x)
	{
		if(x%2==0)
		{
			System.out.println(x+" is a even number");
		}
		else
		{
			System.out.println(x+" is a odd number");
		}
		return 0;	
	}
}
