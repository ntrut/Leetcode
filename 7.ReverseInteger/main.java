class Solution {
    public int reverse(int x) 
    {
        String reverse = String.valueOf(x);
        String output = "";
        
        if(reverse.charAt(0) == '-')
        {
            output = output + reverse.charAt(0);
        }
        
        for(int i = reverse.length()-1;i >= 0; i--)
        {
            if(reverse.charAt(i) != '-')
            {
                 output = output + reverse.charAt(i);
            }
            
        }
        
        System.out.println(output);
        try{
            return Integer.parseInt(output);
        }
        catch(NumberFormatException e)
        {
            return 0;
        }
        
    }
}