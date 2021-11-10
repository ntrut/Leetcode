class MyQueue {
    Stack<Integer> pushStack;
    Stack<Integer> popStack;

    public MyQueue() 
    {
        pushStack = new Stack<>();
        popStack = new Stack<>();
    }
    
    public void push(int x) 
    {
       pushStack.push(x);
    }
    
    public int pop() 
    {
        while(!pushStack.isEmpty())
        {
            popStack.push(pushStack.pop());
        }
        int output = popStack.pop();
        while(!popStack.isEmpty())
        {
            pushStack.push(popStack.pop());
        }
        return output;
    }
    
    public int peek() 
    {
         while(!pushStack.isEmpty())
        {
            popStack.push(pushStack.pop());
        }
        int output = popStack.peek();
        while(!popStack.isEmpty())
        {
            pushStack.push(popStack.pop());
        }
        return output;
    }
    
    public boolean empty() 
    {
        if(pushStack.size() == 0)
        {
            return true;
        }
        else
            return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */