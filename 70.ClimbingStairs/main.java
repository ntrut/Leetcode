class Solution {
    public int climbStairs(int n) {
        // 1 1 2 3 5 8 13... Fibonacci series
        if(n == 1)
        {
            return 1;
        }
        
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(1);
        
        for(int i = 0; i < n; i++)
        {
            if(i == array.size())
            {
                break;
            }
            array.add(array.get(i) + array.get(i + 1));
        }
        
        //System.out.println(array);
        n = array.get(n - 1) + array.get(n - 2);
        return n;
    }
}