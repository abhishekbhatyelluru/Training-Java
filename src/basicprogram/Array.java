package basicprogram;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int a[]={10,2,30,4,50};
		int len=a.length;
		for(i=0;i<=len-1;i++)
		{
			
			System.out.print(a[i]+" ");
			
		}
		System.out.println("");
		for(i=len-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.println("");
		Arrays.sort(a);            //sorting using function
		for(i=0;i<len;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
