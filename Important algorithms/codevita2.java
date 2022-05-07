import  java.util.*;
import java.lang.*;

// varun

public class codevita2 {
    static int ArrayForPrime[] = new int[506];
    static void seiveofferatoness(){
            for(int i=0;i<506;i++)
            {
                ArrayForPrime[i]=1;
            }
        ArrayForPrime[0]=ArrayForPrime[1]=0;
            for(int i1=2;i1*i1<=505;i1++)
            {
                if(ArrayForPrime[i1]>0)
                {
                    for(int j=i1*i1;j<=505;j+=i1)
                    {
                        ArrayForPrime[j]=0;
                    }
                }
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        seiveofferatoness();
        int ele1 = sc.nextInt();
        int ele2 = sc.nextInt();


        boolean  flag=true;
        int period=ele1/ele2,i_c;
        int res=0;
        for(int i=2;i<=period;i++)
        {
            flag=true;
            int timePeriod=i;
            if(ArrayForPrime[timePeriod]>0)
            {

                i_c=1;
                while(timePeriod<=ele1 && i_c<ele2)
                {
                    timePeriod+=period;
                    if(ArrayForPrime[timePeriod]==0)
                    {
                        flag=false;
                        break;
                    }

                    if(flag==true)
                        i_c++;
                }

                if(i_c==ele2)
                {
                    res++;
                }

            }
        }

        System.out.println(res);
    }


    }




















