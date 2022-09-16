package basicprogram;
public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionExample obj=new FunctionExample();
		FunctionExample obj2=new FunctionExample();
		FunctionExample obj3=new FunctionExample();
		FunctionExample obj4=new FunctionExample();
 int total=obj.add(10,20);
 int subtraction=obj2.diff(20,10);
 obj3.mul(5,5);
 obj4.div(8,2);
 System.out.println("Sum is "+total);
 System.out.println("Difference is "+subtraction);
 
	}
int add(int x,int y)
{
	int sum=x+y;
	return(sum);
}
int diff(int x,int y)
{
	int sub=x-y;
	return(sub);
}
void mul(int x,int y)
{
	int mult=x*y;
	System.out.println("Multiplication is "+mult);
	
}
void div(int x,int y)
{
	int divide=x/y;
	System.out.println("Division is "+divide);
	}
}
