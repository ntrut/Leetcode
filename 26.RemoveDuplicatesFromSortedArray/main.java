class Solution {
    public int removeDuplicates(int[] nums)
    {
        if(nums.length == 0)
        {
            return 0;
        }
        
        ArrayList<Integer> unique = new ArrayList<>();
        unique.add(nums[0]);
        for(int i = 0; i < nums.length; i++)
        {
             if(i + 1 == nums.length)
            {
                break;
            }
            
            if(nums[i] != nums[i + 1])
            {
                unique.add(nums[i + 1]);
            }
        }
        
        int[] array = new int[unique.size()];
        
        for(int i = 0; i < array.length; i++)
        {
            //System.out.println(unique.get(i));
            nums[i] = unique.get(i);
            //System.out.println(nums[i]);
        }
        
        
        return unique.size();
    }
}