class Solution {
    public boolean isAnagram(String s, String t) 
    {
        System.out.println(s.length());
        System.out.println(t.length());
        if(s.length() != t.length())
        {
            return false;
        }
        
        HashMap<Character, Integer> shashmap = new HashMap<>(); 
        HashMap<Character, Integer> thashmap = new HashMap<>();
        initailize(s, shashmap);
        initailize(t, thashmap);
        
        for(Map.Entry<Character,Integer> entry: shashmap.entrySet())
        {
            if(thashmap.containsKey(entry.getKey()))
            {
                if(!thashmap.get(entry.getKey()).equals(shashmap.get(entry.getKey())))
                {
                    return false;
                }
            }
            else{
                return false;
            }
        }
        
        return true;
    }
    
    public void initailize(String s, HashMap<Character, Integer> shashmap)
    {
        for(int i = 0; i < s.length(); i++)
        {
            if(!shashmap.containsKey(s.charAt(i)))
            {
                shashmap.put(s.charAt(i), 1);
            }
            else
            {
                shashmap.put(s.charAt(i), shashmap.get(s.charAt(i)) + 1);
            }
        }
    }
}