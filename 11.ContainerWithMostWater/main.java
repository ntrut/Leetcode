class Solution {
    public int maxArea(int[] height) 
    {
        if(height.length == 0)
        {
            return 0;
        }
        
        int len = height.length - 1;
        int right = len;
        int left = 0;
        int area = 0;
        
        while(left < right)
        {
            int min = Math.min(height[left], height[right]);
            area = Math.max(area, (right - left) * min);
            
            //keep the largest height on the left side, if left side is smaller, then we increment the left side
            if(height[left] < height[right])
            {
                left++;
            }
            else{
                right--;
            }
        }
        
        return area;
    }
}