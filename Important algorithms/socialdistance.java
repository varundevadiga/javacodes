import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class socialdistance {

    /**
     * @param args the command line arguments
     */
    static int compute(String s,int k){
        int count=0,res=0;
        if(s.length()==2){
            return 1;
        }
         if(s.length()==1){
            return 1;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                count++;
                if(count>k){
                    res++;
                    count=0;
                    //i++;
                }
                    
            }
            else{
                count=0;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        int n = sc.nextInt();
        int  k = sc.nextInt();
        String s = sc.next();
        int res = compute(s,k);
        System.out.println(res);
        
        }
    }
    
}
