import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     
       
          
	public static void main (String[] args) throws IOException
	 {
	 //code
	  BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
      
        
        while(t-- >0)
        {
           
             HashSet<Integer> set = new HashSet<>();
             int ans=0;
            String st1[] = read.readLine().trim().split(" ");
             int m = Integer.parseInt(st1[0]);
              int n = Integer.parseInt(st1[1]);
            //  System.out.println(m);
          int a[] = new int[m];
             int b[] = new int[n];
           
            String st[] = read.readLine().trim().split(" ");
            for(int i = 0; i < m; i++)
             a[i] = Integer.parseInt(st[i]);
             
              String st2[] = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
             b[i] = Integer.parseInt(st2[i]);
  ///System.out.println(Arrays.toString(a));
  //  System.out.println(Arrays.toString(b));
             for(int i=0;i<m;i++){
                 set.add(a[i]);
             }
            // System.out.println(set);
             for(int i=0;i<n;i++){
                 if(set.contains(b[i])){
                    ++ans;
                    set.remove(b[i]);
                 }
                 
             }
         System.out.println(ans);    
	 }
	 }
}