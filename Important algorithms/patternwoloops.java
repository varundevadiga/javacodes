import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
public static void recure(int n){
if(n>0){
System.out.print(n+" ");
recure(n-5);
System.out.print(n+" ");
}
else
System.out.print(n+" ");

}
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0){
	     int n = sc.nextInt();
	     recure(n);
	     System.out.println();
	   
	   
	      
	     
	 }
	 }
}