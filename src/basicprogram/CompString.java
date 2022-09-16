package basicprogram;

public class CompString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Abhishek";
		String b="Abhishek";
		if(a==b)                                                     //Comparing Two strings
		{
			System.out.println("Two strings are equal");
		}
		else
		{
			System.out.println("Two strings are not equal");
		}
		String c=a+b;
		System.out.println("Concatenation of two string is "+ c);    // Concatenation of String
		int len=a.length();
		System.out.println("Length of the string is "+ len);   //Length of string
		String d=c.substring(0,4);
		System.out.println("substring is "+d );   
		
				
				}
	
  
}
