class Solution {
    public int singleNumber(int[] nums) 
    {   
        int single = 0;
        for(int i = 0; i < nums.length; i++)
        {
            int num = nums[i];
            int total = 1;
            for(int j = 0; j < nums.length; j++)
            {
                if(j != i)
                {
                    if(nums[j] == nums[i])
                    {
                        total++;
                    }
                }
            }
            
            if(total == 1)
            {
                single = nums[i];
                break;
            }
        }
        
        return single;
    }
}