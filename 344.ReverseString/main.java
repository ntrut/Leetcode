class Solution {
    public void reverseString(char[] s) 
    {
        
        System.out.println(s.length / 2);
        if(s.length % 2 == 0)
        {
            int left = 0;
            int right = s.length - 1;
            while(left < right)
            {
                char leftchar = s[left];
                s[left] = s[right];
                s[right] = leftchar;
                
                left++;
                right--;
            }
        }
        else
        {
            int left = 0;
            int right = s.length - 1;
            int threshold = s.length / 2;
            while(left != threshold && right != threshold)
            {
                char leftchar = s[left];
                s[left] = s[right];
                s[right] = leftchar;
                
                left++;
                right--;
            }
        }
    }
}