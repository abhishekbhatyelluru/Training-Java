package javaoops;

public class MultipleCatchblogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result[]=new int[10];
		int i = 11;  //giving array bound error
		try
		{
			
			result[i]=10/0; // Arithmatic error
			System.out.println(result[i]);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Cannot store the in this index");
		}
		catch(ArithmeticException e )
		{
			System.out.println("Cannot devide by zero..please enter different number");
		}
		// If we have two catch then it will print one at a time

	}

}
//We have both exception together..but it will print only arithmatic error

/*output
Cannot devide by zero..please enter different number  */
