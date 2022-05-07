import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc =new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0)
	 {
	    int n = sc.nextInt();
	 long a[] = new long[n];
	 long b[] = new long[n];
	 for(int i=0;i<n;i++){
	     a[i]=sc.nextLong();
	 }
	 for(int i=0;i<n;i++){
	     b[i]=sc.nextLong();
	 } 
	 Arrays.sort(a);
	 Arrays.sort(b);
	 boolean flag=false;
	 for(int i=0;i<n;i++){
	     if(a[i]!=b[i]){
	        
	         flag=true;
	         break;
	     }
	 }
	 if(flag)
	  System.out.println(0);
	 else
	 System.out.println(1);
	 }
	 
	 }
}