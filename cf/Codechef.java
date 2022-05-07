
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
public class Codechef {

    /**
     * @param args the command line arguments
     */
    static boolean chef(int[] a,int n){
        int temp[] = new int[n];
            for(int i=0;i<n;i++){
                temp[a[i]-0]++;
            }
           // System.out.println(Arrays.toString(temp));
            Arrays.sort(temp);
            boolean flag =true;
            for(int i=0;i<temp.length-1;i++){
                if(temp[i]== temp[i+1] && temp[i]!=0 && temp[i+1]!=0){
                    //System.out.println("NO");
                   // return;
                   flag=false;
                   break;
                }
                    
            }
            return flag;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            boolean res = chef(a,n);
            
            if(res)
            System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    
}
