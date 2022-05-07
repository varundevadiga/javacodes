/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
public static void main(String[] args) throws IOException {
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int x =s.nextInt();
            int[] arr= new int[x];
            for (int i = 0; i <x ; i++) {
                arr[i]=s.nextInt();
            }
            Kadane(arr);
            System.out.println("");
        }

    }
    private static void Kadane(int[] arr){
        if (arr.length<1){
            return;
        }
        int currmax=arr[0];
        int globalmax=arr[0];
        int start=0;
        int end=0;
       // ArrayList<Integer> arrayList=new ArrayList<>();
        int z=0;
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]<0){
                currmax=0;
                continue;
            }
            else {
            if (arr[i]>currmax+arr[i]){
                currmax=arr[i];
                start=i;
            }
            else{
                if (currmax==0){
                z=i;
                }
                currmax=currmax+arr[i];
            }
            if (currmax>=globalmax){
                if (z>start){
                    start=z;
                }
                globalmax=currmax;
                end=i;
            }
        }
        }
        for (int i = start; i <=end ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}