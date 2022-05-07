

/**
 *
 * @author Varun
 */
import  java.util.*;
import java.io.*;
import java.lang.*;


public class tcs {
    public static  void  main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        char a[][] = new char[3][n];
        for(int i=0;i<3;i++){
            for(int j=0;j<n;j++){
                a[i][j] = sc.next().charAt(0);
            }
        }
        StringBuilder res = new StringBuilder();
        int c=0,k=0,c1=0,k1=0;
        for(int i=0;i<n;i++){
            if(a[0][i]=='#')
            {
                res.append('#');
                k=0;
                continue;
            }

            k++;
            if(a[0][i]=='.'){
                if(a[1][i]=='.' && a[2][i]=='.'){
                   // i++;
                    --k;
                    continue;
                }
            }
            if(a[0][i]=='.') {

                c++;

            }
            if(k>=3){
                if (c == 1) {
                    res.append('U');
                    k=0;
                    c=0;
                    continue;

                }


                else if (c == 2) {
                    res.append('A');
                    k=0;
                    c=0;
                    continue;
                }
                else{
                    for(int z=i-2;z<=i;z++){
                        if(a[1][z]=='.'){
                            c1++;

                        }
                        k1++;
                        if(k1==3){
                            if(c1==1){
                                res.append('O');
                                k1=0;
                            c1=0;
                            k=0;
                            c=0;
                                continue;
                            }
                            else if(c1==2){
                                res.append('I');
                                k1=0;
                            c1=0;
                            k=0;
                            c=0;
                                continue;
                            }
                            else if(c1==0)
                            {
                                res.append('E');
                               k1=0;
                                c1=0;
                                k=0;
                                c=0;
                                continue;
                            }
                            

                        }
                    }
                }
              
               
            }




        }

      



        System.out.println(res);


    }

}
