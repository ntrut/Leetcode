class Solution {
    public int searchInsert(int[] nums, int target) 
    {
       int output = -1;
        for(int i =0; i < nums.length; i++)
        {
            if(target == nums[i])
            {
                output = i;
            }
        }

        if(output == -1)
        {
            if(target < nums[0])
            {
                output = 0;
            }
            else
            {
                for(int i =0; i < nums.length; i++)
                {
                    if(target < nums[i])
                    {
                       output = i;
                       return output;
                    }
                    else if(i == nums.length - 1)
                    {
                        output = nums.length;
                        return output;
                    }
                }
            }

        }

        return output;
    }
}