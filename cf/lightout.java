import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class lightout {

    /**
     * @param args the command line arguments
     */
    static int arr[][] = new int[3][3]; 
    static void modify(int i,int j,int x){
        arr[i][j]+=x;
        if(i+1<3)
            arr[i+1][j]+=x;
        if(j+1<3)
            arr[i][j+1]+=x;
        if(i-1>-1)
            arr[i-1][j]+=x;
        if(j-1>-1)
            arr[i][j-1]+=x;
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int x =sc.nextInt();
                modify(i,j,x);
                
            }
        }
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]%2==0)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println("");
         }
    }
    
}

//output
1 0 0
0 0 0
0 0 1

Output
Copy

001
010
100

Input
Copy

1 0 1
8 8 8
2 0 3

Output
Copy

010
011
100
