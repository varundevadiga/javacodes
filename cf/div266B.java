import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;


public class div266B {
 
      
    public static void main(String[] args){
      
     Scanner in=new Scanner(System.in);
     
     int n=in.nextInt();
     
     int t=in.nextInt();
     
     String s=in.next();
     
     char[]x=s.toCharArray();
     for(int i=0;i<t;i++)
     {
       for(int y=0;y+1<n;y++)
       {
          if(x[y]=='B' && x[y+1]=='G')
          {
              char r=x[y+1];
              
              x[y+1]=x[y];
              
              x[y]=r;
               
              y++;
          }
       }
     }
     
     int i=0;
     
     StringBuilder e=new StringBuilder();
     while(i<x.length)
     {
       e.append(x[i]);
       
       i++;
     }
     
        System.out.println(e);
             
  
    }
}
 