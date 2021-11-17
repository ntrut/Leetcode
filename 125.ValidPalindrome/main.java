class Solution {
    public boolean isPalindrome(String s) 
    {
        if(s.length() == 1)
        {
            return true;
        }
        
        String newstring = "";
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            c = Character.toLowerCase(c);
            if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'))
            {
                newstring = newstring + c;
            }
        }
        
        int left = 0;
        int right = newstring.length() -1;
        while(left != newstring.length())
        {
            if(newstring.charAt(left) != newstring.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}