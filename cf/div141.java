import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class div141 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] array=Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        //System.out.println(Arrays.toString(array));
       
         int count=0;
         Map<Integer, Integer> map 
            = new HashMap<Integer, Integer>(); 
        for (int i = 0; i < array.length; i++) { 
             int ch = array[i];
           
                if(map.containsKey(ch))
                {
                       map.put(ch, map.get(ch) + 1); 
                       count++;
                }
             
           else
          
                map.put(ch, 1); 
            
        } 
        System.out.println(count);
  
        // Since we want elements in the same order, 
        // we traverse array again and print 
        // those elements that appear more than once. 
  
      /*  for (Entry<Character, Integer> e : map.entrySet()) { 
            if (e.getValue() > 1) { 
                count+=s.length()-1;
                //System.out.print(e.getKey() + " "); 
            } 
        } 
*/
         
       //  System.out.println();
    }
    
}
