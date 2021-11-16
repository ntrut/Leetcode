class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) 
    {
        int ans = 0;
        for(int i = 0; i < items.size(); i++)
        {
            System.out.println(items.get(i));
            if(ruleKey.equals("type"))
            {
                if(items.get(i).get(0).equals(ruleValue))
                {
                    ans++;
                }
            }
            else if(ruleKey.equals("color"))
            {
                if(items.get(i).get(1).equals(ruleValue))
                {
                     ans++;
                }
            }
            else{
                if(items.get(i).get(2).equals(ruleValue))
                {
                     ans++;
                }
            }
        }
        
        return ans;
    }
}