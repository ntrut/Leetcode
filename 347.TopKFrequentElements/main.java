class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        ArrayList<Integer> arraylist = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++)
        {
            if(!hashmap.containsKey(nums[i]))
            {
                hashmap.put(nums[i], 1);
                arraylist.add(nums[i]);
            }
            else
            {
                hashmap.put(nums[i], hashmap.get(nums[i]) + 1);
            }
        }
        
        int counter = 0;
        int[] output = new int[k];
        while(counter < k)
        {
            int max = arraylist.get(0);
            for(int i = 0; i < arraylist.size(); i++)
            {
                //System.out.println("Max: " + max + " i: " + arraylist.get(i));
                if(hashmap.get(max) < hashmap.get(arraylist.get(i)))
                {
                    max = arraylist.get(i);
                }

            }
            output[counter] = max;
            counter++;
            hashmap.remove(max);
            arraylist.remove(new Integer(max));
        }
        
        return output;
    }
}