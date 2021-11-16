class Solution {
    public int firstUniqChar(String s) 
    {
        HashMap<Character, Integer> hashmap = new HashMap<>();
        int ans = -1;
        for(int i = 0; i < s.length(); i++)
        {
            if(!hashmap.containsKey(s.charAt(i)))
            {
                hashmap.put(s.charAt(i), 1);
            }
            else
            {
                hashmap.put(s.charAt(i), hashmap.get(s.charAt(i)) + 1);
            }
        }
        
        for(int i = 0; i < s.length(); i++)
        {
            if(hashmap.get(s.charAt(i)) == 1)
            {
                ans = i;
                break;
            }
        }
        
        return ans;
    }
}