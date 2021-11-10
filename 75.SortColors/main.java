class Solution {
    public void sortColors(int[] nums) 
    {
      
        int zeroes = 0;
        int ones = 0;
        int twos = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0)
            {
                nums[zeroes] = 0;
                zeroes++;
            }
            else if(nums[i] == 1)
            {
                ones++;
            }
            else
            {
                twos++;
            }
        }
        
        for(int i = zeroes; i < zeroes+ones; i++)
        {
            nums[i] = 1;
        }
        
        for(int i = zeroes+ones; i < zeroes+ones+twos; i++)
        {
            nums[i] = 2;
        }
        System.out.println(ones);
        System.out.println(twos);
        
    }
}