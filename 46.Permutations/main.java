class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> array = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        
        backtrack(array,integers,nums);
        
        return array;
    }
    
    public void backtrack(ArrayList<List<Integer>> output, ArrayList<Integer> integers, int[] nums)
    {
        if(integers.size() == nums.length)
        {
            output.add(new ArrayList<>(integers));
        }
        
        for(int i = 0; i < nums.length; i++)
        {
            if(!integers.contains(nums[i]))
            {
                integers.add(nums[i]);
                backtrack(output, integers, nums);
                integers.remove(integers.size() - 1);
            }
        }
    }
}