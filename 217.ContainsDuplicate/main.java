class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        HashMap<Integer, Boolean> hashmap = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(!hashmap.containsKey(nums[i]))
            {
                hashmap.put(nums[i], true);
            }
            else
            {
                return true;
            }
        }
        
        return false;
    }
}