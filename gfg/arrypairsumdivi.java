/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t =  sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int [] a = new int[n];
		   
		    int sum=0;
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		        
		    }
		     int k=sc.nextInt();
		   if(n%2!=0)
		   {
		       System.out.println("False");
		   }
		   if(n%2==0)
		   {
		       for(int i=0;i<n;i++)
		       {
		           sum=sum+a[i];
		       }
		       if(sum%k==0)
		       {
		           System.out.println("True");
		       }
		      else
		       {
		           System.out.println("False");
		       }
		   }
		}  
	}
}