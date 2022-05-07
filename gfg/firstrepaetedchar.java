import java.util.*;
class GFG {
 public static void main (String[] args) {
 Scanner sc = new Scanner(System.in);
 int t =sc.nextInt();
  while(t>0)
  { 
      boolean flag = false;
    String s = sc.next();
   HashMap<Character,Integer> map = new HashMap<Character,Integer>();
   for(int i =0;i<(s.length());i++)
   {
   char c = s.charAt(i);
    if(map.get(c)==null)
    map.put(c,1);

    else {
     int count = map.get(c);
    map.put(c,count+1);

     }

    if(map.get(c)==2) {
        flag = true; 
        System.out.println(c); 
        break;}
}

    if(!flag){
    System.out.println("-1");
       }
    t--;
}
     
 }
    
}