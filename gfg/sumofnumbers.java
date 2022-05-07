class SumNumbers{
    // Function to find the sum of all
    // the numbers in the given string s
    public static long findSum(String s){
        
      String str[]=s.split("[a-z]+");
     // System.out.println(Arrays.toString(str));
     long sum=0;
     for(int i = 0; i < str.length; i++){
     if(!str[i].equals(""))
      sum += Integer.parseInt(str[i]);
      }
      return sum;
        
    }
    
}

//output
Input:
4
1abc23
geeks4geeks
1abc2x30yz67
123abc
Output:
24
4
100
123

Explanation:
Testcase 1: 1 and 23 are numbers in the string which is added to get the sum as 24.
Testcase 2: 4 is the only number , so the sum is 4.
Testcase 3: 1 , 2 , 30 and 67 are the numbers in the string which is added to get the sum as 100.
Testcase 4: 123 is a single number, so sum is 123.