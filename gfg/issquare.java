//is square
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static int checker(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4){
         
           if((x1==0&&y1==0)&&(x2==0 && y2==0))
	         return 0;

	     
         int a = Math.abs(y2-y4);
	     int b = Math.abs(y3-y1);
	     int c = Math.abs(x1-x4);
	     int d = Math.abs(x3-x2);
         if(a==b && c==d)
         return 1;
         
         return 0;
     }
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0){
	     int x1 = sc.nextInt();
	     int y1 = sc.nextInt();
	      int x2 = sc.nextInt();
	     int y2 = sc.nextInt();
	      int x3 = sc.nextInt();
	     int y3 = sc.nextInt();
	      int x4 = sc.nextInt();
	     int y4 = sc.nextInt();
	   
	     
	    int res = checker(x1,y1,x2,y2,x3,y3,x4,y4);
	     if(res==1)
	     System.out.println("Yes");
	     else
	     System.out.println("No");
	 }
	 }
}