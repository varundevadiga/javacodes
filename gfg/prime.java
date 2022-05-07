import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0){
	     int n = sc.nextInt();
	     int flag,i,j;
	     for (i = 2; i <= n; i++) 
	{ 

		// Skip 0 and 1 as they are 
		// niether prime nor composite 
	//	if (i == 1 || i == 0) 
		//	continue; 

		// flag variable to tell 
		// if i is prime or not 
		flag = 1; 

		for (j = 2; j <= Math.sqrt(i); ++j) 
		{ 
			if (i % j == 0) 
			{ 
				flag = 0; 
				break; 
			} 
		} 

		// flag = 1 means i is prime 
		// and flag = 0 means i is not prime 
		if (flag == 1) 
			System.out.print(i + " "); 
	} 
	     System.out.println("");
	 }
	 
	 }
}