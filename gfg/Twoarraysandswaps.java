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
public class Twoarraysandswaps {

    /**
     * @param args the command line arguments
     */
    static int compute(int[] a,int[] a1,int k){
         int res=0;
        for(int i=0;i<a.length;i++){
            res+=a[i];
        }
        if(k==0)
            return res;
        Arrays.sort(a);
        Arrays.sort(a1);
       // int t = k;
       // while(k-->0){
            for(int i=a1.length,j=k; j!=0 && i>=0 ;i--,j--){
                if(a1[i-1]>a[a.length-i]){
                    a[a.length-i]=a1[i-1];
                }
            }
      //  }
        int sum1=0;
        for(int i=0;i<a.length;i++){
            sum1+=a[i];
        }
        return sum1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            int a1[] = new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            for(int i=0;i<n;i++)
                a1[i]=sc.nextInt();
           // System.out.println(Arrays.toString(a1));
           int sum = compute(a,a1,k);
           System.out.println(sum);
                
        }
        
    }
    
}