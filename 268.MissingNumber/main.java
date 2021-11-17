class Solution {
    public int missingNumber(int[] nums) 
    {
       int len = nums.length + 1;
        HashMap<Integer,Boolean> hashmap = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++)
        {
            if(!hashmap.containsKey(nums[i]))
            {
                hashmap.put(nums[i], true);
            }
        }
        
        for(int i = 0; i <= len; i++)
        {
            if(!hashmap.containsKey(i))
            {
                return i;
            }
        }
        
        return -1;
    }
}