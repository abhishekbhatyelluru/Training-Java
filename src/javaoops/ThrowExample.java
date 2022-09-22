package javaoops;

class Throw
{
	static void passport(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("not valid");
		}
		else
		{
			System.out.println("You are eligible to passport");
		}
	}
}

public class ThrowExample extends Throw{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		passport(20);
			
	}

}
