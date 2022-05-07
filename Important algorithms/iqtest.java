import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class iqtest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];
        
       
	        	
	      
    
          int odd=0;
      
      int even=0;
              
      for(int i=0;i<x.length;i++)
      {
          x[i]=sc.nextInt();
          
          if(x[i]%2==0)
              even++;
          else
              odd++;
      }
      
      int ind=0;
      if(odd>even)
      {
         n=0;
         
         while(n<x.length)
         {
           if(x[n]%2==0)
           {
              ind=n+1;
              break;
           }
           n++;
         }
      }
      else
      {
        n=0;
         
         while(n<x.length)
         {
           if(x[n]%2>0)
           {
              ind=n+1;
              break;
           }
           n++;
         }   
      }
      
        System.out.println(ind);
}
}
