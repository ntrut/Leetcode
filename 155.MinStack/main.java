class MinStack {
    ArrayList<Integer> array;
    public MinStack() {
        array = new ArrayList<Integer>();
    }
    
    public void push(int val) {
        array.add(val);
    }
    
    public void pop() {
        
    array.remove(array.size() - 1);
        
    }
    
    public int top() {
        return array.get(array.size() - 1);
    }
    
    public int getMin() 
    {
        int min = array.get(0);
        for(int i = 1; i < array.size(); i++)
        {
            min = Math.min(min, array.get(i));
        }
        
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */