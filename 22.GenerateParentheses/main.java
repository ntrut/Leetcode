class Solution {
    public List<String> generateParenthesis(int n) 
    {
        ArrayList<String> output = new ArrayList<>();
        backtrack(output, n, 0,0,"");
        return output;
    }
    
    public void backtrack(List<String> array, int n, int open, int close, String s)
    {
        if(s.length() == n*2)
        {
            array.add(s);
            return;
        }
        
        //make two decsions here
        //if open is less than max, then add a open?
        if(open < n)
        {
            //System.out.println("in open: " + s);
            backtrack(array, n, open+1, close, s + "(");
        }
        //if close is less than open, then backtrack
        if(close < open)
        {
            //System.out.println("in close: " + s);
            backtrack(array, n, open, close+1, s + ")");
        }
    }
}