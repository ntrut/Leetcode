class Solution {
    public int findKthLargest(int[] nums, int k) 
    {
        if(nums.length == 1)
        {
            return nums[0];
        }
        
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++)
        {
            arraylist.add(nums[i]);
        }
        Collections.sort(arraylist);
        
        return arraylist.get(arraylist.size() - k);
    }
}