gcd of the array

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int i =0; i < test; i++){
		    int n  = sc.nextInt();
		    int arr[] = new int[n];
		    for(int j = 0; j < n; j++){
		        arr[j] = sc.nextInt();
		    }
		    int res = findGCD(arr, n);
		    System.out.println(res);
		}
	}
	public static int findGCD(int arr[], int n){
		int rem = arr[0];
		for(int i = 0; i < n; i++){
		    rem = gcd(arr[i], rem);
		}
		return rem;
	}
	public static int gcd(int a, int b){
	   if(a == 0)
	       return b;
	   return gcd(b%a, a);
	} 
}