class Solution {
    public int jump(int[] nums) {
        
      int len = nums.length - 1;
        int curr = -1;
        int next = 0;
        int ans = 0;
        
        for(int i = 0; next < len; i++)
        {
            System.out.println("i: " + i + " curr: " + curr);
            if(i > curr){
                ans++;
                curr = next;
            }
            next = Math.max(next, nums[i] + i);
            System.out.println(next);
        }
        
        return ans;
    }
}