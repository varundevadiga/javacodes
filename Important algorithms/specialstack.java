public void push(int a,Stack<Integer> s)
	{
	    //add code here.
	    s.push(a);
	}
	public int pop(Stack<Integer> s)
        {
            //add code here.
            return s.pop();
	}
	public int min(Stack<Integer> s)
        {
           //add code here.
           int t=0;
Stack<Integer>temp = new Stack<>();
if(!s.empty()){
t=s.peek();
temp.push(s.peek());
s.pop();
}
while(!s.empty()){
if(t>s.peek()){
t=s.peek();
}
temp.push(s.peek());
s.pop();
}
while(!temp.empty()){
s.push(temp.peek());
temp.pop();
}
return t;
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
           if(s.size()==n)
           return true;
           
           return false;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
           if(s.isEmpty())
           return true;
           return false;
	}


///
Input:
1
5
18 19 29 15 16
Output:
15