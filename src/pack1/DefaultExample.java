package pack1;
import pack2.*;


public class DefaultExample extends Addd  { //inherites the otherpackage function

	public static void main(String[] args) {
		
		DefaultExample obj=new DefaultExample();
		obj.subss();       //displaying protected value here
		obj.a();           //Normal method object calling
	    }
		
		void a()
		{
			System.out.println("Hii");
		}
		

}
