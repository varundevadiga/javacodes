
    static int majorityElement(int a[], int size)
    {
    HashMap<Integer,Integer> hm = new HashMap<>(size);
    for(int i=0;i<size;i++){ 
    if(hm.containsKey(a[i]))
    {
     hm.put(a[i],hm.get(a[i])+1);
    }
    else
        hm.put(a[i],1);
    if(hm.get(a[i])>(size/2)){
        return a[i];
     }
   }
        return -1;
    }
//output
Input:
2
5
3 1 3 3 2
3
1 2 3
Output:
3
-1

Explanation:
Testcase 1: Since, 3 is present more than N/2 times, so it is the majority element.
Testcase 2: Since, each element in {1,2,3} appears only once so there is no majority element.