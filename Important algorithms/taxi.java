import java.util.*;
public class taxi{
public static void main(String[]A){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(),a[]=new int[5];
for(;n-->0;)
a[sc.nextInt()]++;
System.out.print(a[4]+a[3]+(Math.max(0,a[1]-a[3])+a[2]*2+3)/4);
}
}