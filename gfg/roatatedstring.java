//check if string is rotated by 2 places

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0){
	     String a = sc.next();
	     String b = sc.next();
	     char c[] = b.toCharArray();
	     char temp[] = new char[2];
	     temp[0]= c[0];
	     temp[1]=c[1];
	      
        for(int i=2;i<c.length;i++)
            c[i-2]=c[i];
         for(int i=0;i<2;i++)
            c[c.length-2+i]=temp[i];
            
             char d[] = b.toCharArray();
             char temp1[] = new char[2];
	        temp1[0]= d[d.length-1];
	        temp1[1]=d[d.length-2];
	      //  System.out.println(temp1[1]);
	         for(int i=d.length-1;i>=2;i--)
              d[i]=d[i-2];
         for(int i=0;i<2;i++)
            d[i]=temp1[1-i];
            
	     String str = new String(c);
	     String str1 = new String(d);
	     if(str.equals(a) || str1.equals(a))
	     System.out.println(1);
	     else
	     System.out.println(0);
	 }
	 }
}