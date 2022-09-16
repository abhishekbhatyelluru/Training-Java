package javaoops;

class Loginn                        // Multilevel inheritance
{
	void verifyloginn()
	{
		System.out.println("Login is verified");
	}
}
class Benificiaryy extends Loginn
{
	void verifybenyficiaryy()
	{
		System.out.println("Benificiary is verified");
	}
}

public class TransferFund extends Benificiaryy
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransferFund obj=new TransferFund();
		obj.verifybenyficiaryy();
		obj.transferfundd();
		obj.verifyloginn();
		
		
	}
	void transferfundd()
	{
		System.out.println("Fund is transfered");
	}

}
