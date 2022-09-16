package basicprogram;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd obj=new EvenOdd();
		obj.evnodd(10);
	}
void evnodd(int x)
{
	if(x%2==0)
	{
		System.out.println(x+" is a even number");
	}
	else
	{
		System.out.println(x+" is a odd number");
	}
		
}
}
