package javaoops;

public class PolyExample {
	int sum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyExample obj1=new PolyExample();
		obj1.add(10,20);
		obj1.add(10.5f,2.5f);
		obj1.add(10,20,30);
	}
void add(int a,int b)
{
	 sum=a+b;
	System.out.println("Sum is "+sum);
}
void add(float a,float b)
{
    float sum=a+b;
	System.out.println("Sum is "+sum);
	
}
void add(int x,int y,int z)
{
	sum=x+y+z;
	System.out.println("Sum is "+sum);
}

}