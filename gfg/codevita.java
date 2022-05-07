import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Varun
 */
public class codevita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
       // System.out.println(a[3][3]);
       /* for (Long[] row : a) 
  
            // converting each row as string 
            // and then printing in a separate line 
            System.out.println(Arrays.toString(row)); */
       int sum=0;
      
       int min=0;
        int start = min;
        int pos=0;
        int a1=0;
              int b1=0;
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               min = Math.min(a[a1][b1+1],a[b1+1][a1]);
              // pos = 
             
              if(min==a[i][j+1]){
                  a1=i;
                  b1=j+1;
              }
              if(min==a[j+1][i]){
                  a1=j+1;
                  b1=i;
              }
               sum+=Math.floor(start/2)+min;
               break;
           }
       }
       
    
       System.out.println(sum);
       
    }
    
}
