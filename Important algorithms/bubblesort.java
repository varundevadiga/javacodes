import java.util.*;
import java.io.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
       

       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
            long a[] = new long[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
           for(int i=0;i<n;i++)
           a[i]= Integer.parseInt(st.nextToken());
           int count=0;
           boolean flag=true;

           while(flag!=false){
               flag=false;
               count++;
               for(int i=0;i<n-1;i++){
                   if(a[i]>a[i+1]){
                     long temp = a[i];
                       a[i]=a[i+1];
                       a[i+1]=temp;
                       flag=true;
                   }
               }
           }
           //System.out.println(Arrays.toString(a));
           
            System.out.println(count);
       
        




    }
}
