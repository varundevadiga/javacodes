import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
public static void main (String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
long n=Long.parseLong(br.readLine());
String bin=Long.toBinaryString(n);
System.out.println(bin);
int len=bin.length();
StringBuilder str=new StringBuilder(bin);
str.reverse();
String res=String.valueOf(str);
if(len<32)
{
int diff=32-len;
for(int i=0;i<diff;i++) 
res+=0 ;
}
System.out.println(Long.parseLong(res,2));
    
}} }