import java.util.*;
import java.lang.*;
import java.io.*;
public class minimal{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
while(t-->0){
int a = sc.nextInt();
int b = sc.nextInt();
int res = Math.max((2*(Math.min(a,b))),Math.max(a,b));
System.out.println(res*res);
}
}
}