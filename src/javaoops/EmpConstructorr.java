package javaoops;

public class EmpConstructorr {
	int id;
	String namee;
	int sal;
	String des;

	public static void main(String[] args) {
			
		// TODO Auto-generated method stub
		EmpConstructorr obj1=new EmpConstructorr(123,"abhi",25000,"trainee");
		obj1.display();
		EmpConstructorr obj2=new EmpConstructorr(1234,"abhishek",10000,"Manager");
		obj1.display();

	}
	EmpConstructorr(int empid,String name,int salary,String designation)
	{
		 id=empid;
		 namee=name;
		 sal=salary;
		 des=designation;
		
	}
	void display()
	{
		System.out.println(id);
		System.out.println(namee);
		System.out.println(sal);
		System.out.println(des);
		System.out.println("");
	}

	

}
