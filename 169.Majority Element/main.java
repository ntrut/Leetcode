class Solution {
    public int majorityElement(int[] nums)
    {
        int majorityElement = 0;
        int max = 0;
        
        HashMap<Integer, Boolean> hashmap = new HashMap<Integer, Boolean>();
        for(int i = 0; i < nums.length; i++)
        {
            if(!hashmap.containsKey(nums[i]))
            {
                int total = 0;
                for(int j =0; j < nums.length; j++)
                {
                    if(nums[i] == nums[j])
                    {
                        total++;
                    }
                }
                
                hashmap.put(nums[i], true);
                if(max < total)
                {
                    //System.out.println(nums[i]);
                    //System.out.println(max);
                    //System.out.println(total);
                    majorityElement = nums[i];
                    max = total;
                    
                }
                
            }
        }
        
        
        return majorityElement;
    }
}