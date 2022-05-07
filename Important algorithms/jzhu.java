import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import static java.lang.System.*;

/**
 *
 * @author Varun
 */
public class jzhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
       Queue<Children> queue = new LinkedList<>();
 
        for(int i=0;i<n;i++){
            queue.add(new Children(i,sc.nextInt()));
        }
 
 
        while (queue.size()!=1){
            Children top = queue.poll();
 
            if(top.need>m){
                queue.add(new Children(top.index,top.need-m));
            }
 
 
        }
 
 
        out.println(queue.peek().index+1);
 
 
 
 
        out.close();
    }
 
    static class Children{
        int index;
        int need;
        boolean isSatisfy;
 
        public Children(int index, int need) {
            this.index = index;
            this.need = need;
 
        }
    }
}