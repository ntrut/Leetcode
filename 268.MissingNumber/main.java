class Solution {
    public int missingNumber(int[] nums) 
    {
        int total = 0;
        int sum = 0;
        
        for(int i = 0; i < nums.length+1; i++)
        {
            total = total + i;
        }
        
        for(int i = 0; i < nums.length; i++)
        {
            sum = sum + nums[i];
        }
        
        return total - sum;
    }
}
