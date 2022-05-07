static void subarraySum(int n, int s, int[] m) {
      
       int sum = 0;
        int end = 0;
        int start = 0;
       boolean flag = false;
        for(int i = 0; i < n; i++) {
           sum += m[i];

       while(sum > s) {
        sum -= m[start++];
        }

         if(sum == s) {
           end = i;
         flag = true;
        break;
       }
         }
        if(flag)
        System.out.print((start+1) + " " + (end+1));
       else
      System.out.print(-1);
    }
//output
Input:
3
5 12
1 2 3 7 5
10 15
1 2 3 4 5 6 7 8 9 10
4 15
5 7 1 2
Output:
2 4
1 5
1 4

Explanation :
Testcase1: the sum of elements from 2nd position to 4th position is 12.