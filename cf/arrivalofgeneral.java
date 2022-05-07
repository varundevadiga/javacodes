
import java.util.Scanner;
import static java.lang.System.*;
import java.io.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Varun
 */
public class arrivalofgeneral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
            int n=sc.nextInt();
           int a[]=new int[n+2];
           int idxmin=0;
           int idxmax=0;
           int minidx=0;
           int maxidx=0;
           int min=Integer.MAX_VALUE;
           int max=Integer.MIN_VALUE;
           for(int i=1;i<=n;i++){
               a[i]=sc.nextInt();
               if(a[i]>max){ max=a[i]; idxmax=i;}
               if(a[i]<=min){ min=a[i];idxmin=i;}
           }
          if(a[n]!=min){
               minidx=n-idxmin;
           }
           if(a[1]!=max){
              maxidx=idxmax-1;
           }
           if(idxmax<idxmin)
           out.println(minidx+maxidx);
           else
               out.println(minidx+maxidx-1);
        }
        
        
    
    
}
