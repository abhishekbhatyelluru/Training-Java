package basicprogram;

public class GrearestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=200;
		int c=50;
		System.out.println("Three numbers are "+a+" "+b+" "+c);
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("Greatest No is "+a);
			}
			else
			{
				System.out.println("Greatest No is "+c);
			}
		}
		else if(b>c)
		{
			System.out.println("Greatest No is "+b);
		
		}
		else
		{
			System.out.println("Greatest No is "+c);
		}
		
	}

}
