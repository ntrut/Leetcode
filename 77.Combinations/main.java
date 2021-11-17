class Solution {
    public List<List<Integer>> combine(int n, int k) 
    {
       ArrayList<List<Integer>> output = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        
        backtrack(output, integers, 1, n, k);
        
        return output;
    }
    
    public void backtrack(ArrayList<List<Integer>> output, ArrayList<Integer> integers, int start, int n, int k)
    {
        if(k == 0)
        {
            ArrayList temp = new ArrayList<>(integers);
            output.add(temp);
            
            return;
        }
        
        for(int i = start; i <= n; i++)
        {
            if(!integers.contains(i))
            {
                integers.add(i);
                backtrack(output, integers,i+1,n,k-1);
                integers.remove(integers.size() - 1);
            }
        }
    }
}