class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();
        
        backtrack(list, intList, 0, nums);
        
        return list;
    }
    
    public void backtrack(ArrayList<List<Integer>> list, ArrayList<Integer> intList, int start, int[] nums)
    {
        list.add(new ArrayList<>(intList));
        
        for(int i = start; i < nums.length; i++)
        {
            intList.add(nums[i]);
            backtrack(list,intList,i+1,nums);
            intList.remove(intList.size()-1);
        }
    }
}