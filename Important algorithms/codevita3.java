import  java.util.*;
import java.io.*;
import java.lang.*;


public class codevita3 {
    static void compute(PriorityQueue<Long> prioqueue,int k){
        while(k-->0){
            long maxele = prioqueue.peek();

            prioqueue.poll();
            prioqueue.add((long)Math.floor(maxele/2));
        }
        int answer=0;
        while(!prioqueue.isEmpty()){
            answer+= prioqueue.peek();
            prioqueue.poll();
        }
        System.out.println(answer);
    }
    public static  void main(String[]  args) throws IOException{
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       String s[] = bf.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        PriorityQueue<Long> prioqueue = new PriorityQueue<>(Collections.reverseOrder());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0;i<n;i++){
            prioqueue.add(Long.parseLong(st.nextToken()));

        }
        compute(prioqueue,k);
       // System.out.println(pq);




    }
}

