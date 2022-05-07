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
	     int arr[] = new int[n];
	     int freq[] = new int[n+1];
	    
	     long miss = 1;
	     
	      int dup=0;
	     for(int i=0;i<n;i++){
	         arr[i]=sc.nextInt();
	     }
	      
	    
	     for(int i=0;i<n;i++){
	         freq[arr[i]]++;
	    }

	    
	     for(int i=0;i<freq.length;i++){
	         if(freq[i]==2)
	         dup=i;
	         if(freq[i]==0 && i!=0){
	             miss=i;
	         }
	     }
	      
	     System.out.println(dup+" "+miss);
	 }
	 }
}