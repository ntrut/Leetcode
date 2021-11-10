class Solution {
    public void moveZeroes(int[] nums)
    {
        Stack<Integer> numbers = new Stack<Integer>();
        Stack<Integer> zeroes = new Stack<Integer>();
        if(nums.length == 1)
        {
            return;
        }
        
        for(int i = 0; i < nums.length ;i++)
        {
            if(nums[i] != 0)
            {
                numbers.push(nums[i]);
            }
            else
            {
                zeroes.push(nums[i]);
            }
        }
        
        
        while(!zeroes.isEmpty())
        {
            numbers.push(zeroes.pop());
        }
        
        for(int i = nums.length - 1; i >= 0; i--)
        {
            nums[i] = numbers.pop();
        }
    }
}