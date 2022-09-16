package basicprogram;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Abhishek";
		String rev="";
		int len=a.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		System.out.println("Original string is "+a);
		System.out.println("reverse of a string is "+rev);
	
	}

}
