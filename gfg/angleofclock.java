import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {

       Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
      for(int i=0;i<t;i++){ 
          double h= sc.nextDouble();
          double m=sc.nextDouble();
         double angle =Math.abs(((11*m)/2)-(30*h));
         if(angle>=180)
         angle=360-angle;
          if(m==60)
        angle=angle+30;
        System.out.println((int)angle);
     }
   }
     
}