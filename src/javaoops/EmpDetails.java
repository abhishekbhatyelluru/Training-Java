package javaoops;
public class EmpDetails {
	int id;
	String namee;
	int sal;
	String des;
	static String comanyname="Evry";         //static variable declaration....It will not change

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDetails obj1=new EmpDetails();
		obj1.init(123,"abhi",25000,"trainee");
		obj1.display();
		EmpDetails obj2=new EmpDetails();
		obj1.init(1234,"abhishek",10000,"Manager");
		obj1.display();
	}
	void init(int empid,String name,int salary,String designation)
	{
		 id=empid;
		 namee=name;
		 sal=salary;
		 des=designation;
	}
	void display()
	{
		System.out.println("Company name is " +comanyname);
		System.out.println(id);
		System.out.println(namee);
		System.out.println(sal);
		System.out.println(des);
		System.out.println("");
	}

}
