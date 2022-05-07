import java.io.*;
import java.util.*;
 

 
public class div263A {
    public static void main(String args[]) throws IOException {
        try {
            Scanner sc = new Scanner(System.in);
        
            int a=0,b=0;
            
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= 5; j++) {
                    int x=sc.nextInt();
                    if(x==1){
                        a=i;
                        b=j;
                    }
                }
            }
            int ans=Math.abs(a-3)+Math.abs(b-3);
           System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
 