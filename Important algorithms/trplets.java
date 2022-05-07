import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     while(t-->0){
	         int n = sc.nextInt();
	         int[] arr = new int[n];
	         for(int i=0; i<n; i++){
	             arr[i] = sc.nextInt();
	         }
	         res(arr, n);
	     }
	 }
	 
	 static void res(int[] arr, int n){
	     HashSet<Integer> hs = new HashSet<>();
	     int sum=0,count=0;
	     boolean flag = false;
	     for(int i=0; i<n; i++){
	         hs.add(arr[i]);
	     }
	     for(int i=0; i<n; i++){
	         sum = 0;
	         for(int j=i; j<n; j++){
	             if(i != j){
	                 sum = arr[i]+arr[j];
	                 if(hs.contains(sum)){
	                     flag = true;
	                     count++;
	                 }
	             }
	         }
	     }
	     if(flag){
	       System.out.println(count);
	     }
	     else{
	           System.out.println(-1);
	     }
	 }
}