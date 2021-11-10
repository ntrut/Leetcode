class Solution {
    public int romanToInt(String s) 
    {
         int total = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if(i == 0)
            {
                if(s.charAt(i) == 'I')
                {
                    total = total + 1;
                }
                else if(s.charAt(i) == 'V')
                {
                    total = total + 5;
                }
                else if(s.charAt(i) == 'X')
                {
                    total = total + 10;
                }
                else if(s.charAt(i) == 'L')
                {
                    total = total + 50;
                }
                else if(s.charAt(i) == 'C')
                {
                    total = total + 100;
                }
                else if(s.charAt(i) == 'D')
                {
                    total = total + 500;
                }
                else if(s.charAt(i) == 'M')
                {
                    total = total + 1000;
                }
            }
            else
            {
                if(s.charAt(i) == 'I')
                {
                    total = total + 1;
                }
                else if(s.charAt(i) == 'V')
                {
                    if(s.charAt(i - 1) == 'I')
                    {
                        total = total + 3;
                    }
                    else
                    {
                        total = total + 5;
                    }
                }
                else if(s.charAt(i) == 'X')
                {
                    if(s.charAt(i - 1) == 'I')
                    {
                        total = total + 8;
                    }
                    else
                    {
                        total = total + 10;
                    }
                }
                else if(s.charAt(i) == 'L')
                {
                    if(s.charAt(i - 1) == 'X')
                    {
                        total = total + 30;
                    }
                    else
                    {
                        total = total + 50;
                    }
                }
                else if(s.charAt(i) == 'C')
                {
                    if(s.charAt(i - 1) == 'X')
                    {
                        total = total + 80;
                    }
                    else
                    {
                        total = total + 100;
                    }
                }
                else if(s.charAt(i) == 'D')
                {
                    if(s.charAt(i - 1) == 'C')
                    {
                        total = total + 300;
                    }
                    else
                    {
                        total = total + 500;
                    }
                }
                else if(s.charAt(i) == 'M')
                {
                    if(s.charAt(i - 1) == 'C')
                    {
                        total = total + 800;
                    }
                    else
                    {
                        total = total + 1000;
                    }
                }
            }


        }

        return total;

    }
}