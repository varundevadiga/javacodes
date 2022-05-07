import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class swayamvara {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        Deque<Character> deque 
            = new LinkedList<>(); 
        if(a.length()==1){
            if(a.charAt(0)!=b.charAt(0))
                System.out.println(1);
            else
                System.out.println(0);
                        
        }
        else{
            for(int i=0;i<n;i++)
    {
        deque.add(b.charAt(i));
    }
        int i=0,pairs=0;
    int flag=0,cnt=0;
    while(i<n && cnt<=deque.size())
    {
        flag=0;
        if(a.charAt(i)==deque.peek())
        {
            cnt=0;
           
            flag=1;
            pairs++;
            i++;
            deque.pollFirst();
        }
        else
        {
            if(flag==0)
            {
                char bride=deque.peek();
              
                deque.pollFirst();
                deque.addLast(bride);
                cnt++;
            }
            else
            {
                cnt=0;
            }
        }
    }
    if(pairs==n)
    {
      System.out.println(0);
    }
    else
    {
        System.out.println(Math.abs(n-pairs));
    }

        }
        
    }
    
}
