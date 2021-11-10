class Solution {
    public boolean isPalindrome(int x) 
    {
        String number = Integer.toString(x);
        String newX = "";


        for(int i = number.length() - 1; i >= 0; i--)
        {
            newX = newX + number.charAt(i);
        }

        if(newX.equals(number))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}