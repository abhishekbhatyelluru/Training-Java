package javaoops;

public class CatchClass {

	public static void main(String[] args) {
		
		int result[]=new int[10];
		int i = 7;   error
		try
		{
			
			result[i]=10/0; // Arithmatic error
			System.out.println(result[i]);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Cannot store the in this index");
		}
	//	catch(ArithmeticException e )
	//	{
	//		System.out.println("Cannot devide by zero..please enter different number");
	//	}
		catch(Exception e)
		{
			System.out.println("If any exception is there other than arithmatic & arry...That will be printed here");
		}
	}

}
