import java.lang.*;
import java.io.*;
import java.util.*;
class GFG 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int testcase=s.nextInt();  
        while(testcase-->0)
        {
            int n=s.nextInt();              // Inputting n
            int p=s.nextInt();              // Inputting p
            int[][] arr=new int[n+1][p+1];  // Declaring the array with size n+1 and p+1
            for(int i=0;i<=n;i++)
            {
    	        for(int j=0;j<=min(i,p);j++)    // If j>=i arr will always remain as 0. So checking min of i and p.
    		    {
    			    if(j==0||j==i)
    				arr[i][j]=1;                // In nCp if p is 0 or equal to n answer is 1.
    			    else
    				arr[i][j]=arr[i-1][j-1]%1000000007+arr[i-1][j]%1000000007;  // nCp = (n-1)Cp + (n-1)C(p-1)
    		    }
            }
            System.out.println(arr[n][p]%1000000007);
           // testcase--;
        }
    }
    static int min(int a, int b) 
        { 
        return (a<b)? a: b;  
        } 
}
