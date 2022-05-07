
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
       

       
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        
        while(t-- >0){
            int sum=0;
            int x = s.nextInt();
             int y = s.nextInt();
              int z = s.nextInt();
              if(x==1){
               a[y]=z;
              }
              if(x==2){
               for(int i=y;i<=z;i++){
                   sum+=a[i];
               }
                System.out.println(sum);
              }   
            
        }

     




    }
}
