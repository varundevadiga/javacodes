import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static char find(int a,int b,int k){
         long res = (long)Math.pow(a,b);
         String s = String.valueOf(res);
         int len = s.length();
         return s.charAt(Math.abs(len-k)) ;
     }
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	  int t = sc.nextInt();
	  while(t-->0){
	      int a = sc.nextInt();
	      int b = sc.nextInt();
	      int k = sc.nextInt();
	      System.out.println(find(a,b,k));
	  }
	 }
}