//anagram checking


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
	     String str1 = sc.next();
	     String str2 = sc.next();
	     char a[] = str1.toCharArray();
	      char a2[] = str2.toCharArray();
	      Arrays.sort(a);
	      Arrays.sort(a2);
	      if(Arrays.equals(a,a2))
	      System.out.println("YES");
	      else
	      System.out.println("NO");
	     
	 }
	 }
}
//
Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0){
	     String str1 = sc.next();
	     String str2 = sc.next();
	     char a[] = str1.toCharArray();
	      char a2[] = str2.toCharArray();
	      Arrays.sort(a);
	      Arrays.sort(a2);
	      String s1 = new String(a);
	      String s2 = new String(a2);
	      if(s1.equals(s2))
	      System.out.println("YES");
	      else
	      System.out.println("NO");
	     
	 }