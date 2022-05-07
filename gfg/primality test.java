
//prime using big integer class

BigInteger n = scanner.nextBigInteger();
      //in.close();
      scanner.close();
      System.out.println(n.isProbablePrime(1) ? "prime" :"not prime");

//
import java.util.*;
import java.io.*;
class solution{
    public static void main(String [] args){
        Primality obj = new Primality();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T --> 0){
            
            int V = sc.nextInt();
            if(obj.isPrime(V))
            System.out.println("Yes");
            else
            System.out.println("No");
            
            
            
        }
    }
}



class Primality 
{
    
    public boolean isPrime(int N)
    {
        if(N==1)//1 is not prime so return false
        return false;
        
        for(int i=2;i<=Math.sqrt(N);i++)////We check from 2 from sqrt(N) as divisors, if any, would exist till sqrt(N)
        {
            if(N%i==0)//If any i divides the number this means the nubmer is not prime
            return false;
        }
        return true;//return true in other cases
    }

}
