import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the gemstones function below.
    static String removeDuplicate(char str[], int n) 
    { 
        // Used as index in the modified string 
        int index = 0; 
  
        // Traverse through all characters 
        for (int i = 0; i < n; i++) 
        { 
  
            // Check if str[i] is present before it  
            int j; 
            for (j = 0; j < i; j++)  
            { 
                if (str[i] == str[j]) 
                { 
                    break; 
                } 
            } 
  
            // If not present, then add it to 
            // result. 
            if (j == i)  
            { 
               
                str[index++] = str[i]; 
            } 
        } 
       
        return String.valueOf(Arrays.copyOf(str, index)); 
    } 
    static int gemstones(String[] arr) {
        int arr1[] = new int[26];

        for(int i=0;i<arr.length;i++){
           char str[] = arr[i].toCharArray(); 
            int n = str.length; 
            String res = removeDuplicate(str,n);
           //System.out.println(res);
            for(int j=0;j<res.length();j++){
             arr1[res.charAt(j)-'a']++;
            }

        }
        int count=0;
        for(int i : arr1){
            if(i==arr.length)
            count++;
        }
     

        return count;
    
    
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String arrItem = scanner.nextLine();
            arr[i] = arrItem;
        }

        int result = gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
