package javaoops;

public class StaticProgram {
	int id;
	String namee;
	int sal;
	String des;
	static String comanyname="Evry";  
	static String comanylocation; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticProgram obj1=new StaticProgram();
		obj1.init(123,"abhi",25000,"trainee");
		initstaticvalue();         //static function calling....declaring without the object
		obj1.display();
		StaticProgram obj2=new StaticProgram();
		obj2.init(1234,"abhishek",10000,"Manager");
		initstaticvalue();
		obj2.display();

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
		System.out.println(comanylocation);
		System.out.println(des);
		System.out.println("");
	}
	static void initstaticvalue() //static function
	{
		comanylocation="Bangalore";
	}
	static  //static block....It will execute first..no need to calling
	{
		System.out.println("Welcome to IT field");
		System.out.println("");
	}

}
