class Solution {
    public int findDuplicate(int[] nums) 
    {
        if(nums.length == 1)
        {
            return nums[0];
        }
        
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++)
        {
            if(hashmap.containsKey(nums[i]))
            {
                return nums[i];
            }
            else
            {
                hashmap.put(nums[i], 1);
            }
        }
        
        return 0;
    }
}