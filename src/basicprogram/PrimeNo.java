package basicprogram;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i=0;
      int n=29;
      int flag=0;
      for(i=2;i<n;i++)
      {
    	  if(n%i==0)
    	  {
    		 flag=1;
    		 break;
    	  }
      }
      if(flag==1)
	  {
		  System.out.println(n+" is not a prime number");
	  }
	  else
	  {
		  System.out.println(n+" is a prime number");
	  }
	}

}
