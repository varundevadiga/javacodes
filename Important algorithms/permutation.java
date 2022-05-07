/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	while(n-->0)
	{
	    String s=sc.next();
	    int len=s.length();
	    GFG gg=new GFG(); 
	    Set<String>perm=new HashSet<String>();
	   gg.permuter(s,perm,0,len-1); 
	   int sz=perm.size();
	   String arr[]=new String[sz];
	   arr=perm.toArray(arr);
	   Arrays.sort(arr);
	   for(int i=0;i<sz;i++)
	   {
	       System.out.print(arr[i]+" ");
	   }
	    System.out.println();
	    
	    
	}
	
	
}
 public void permuter(String s,Set<String>perm,int l,int r)
 {
     
     if(l==r)
      {
          perm.add(s);
      } 
     else
     {
         for(int i=l;i<=r;i++)
         {
             s=swap(s,l,i);
             permuter(s,perm,l+1,r);
             s=swap(s,l,i);
         }
         
         
     }
     
     
 }
 public String swap(String s,int l,int r)
 {
     char temp;
     char[] ch=s.toCharArray();
     temp=ch[l];
     ch[l]=ch[r];
     ch[r]=temp;
     
     return String.valueOf(ch);
 }
}