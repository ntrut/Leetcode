class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length >= nums2.length)
        {
            return getArray(nums1,nums2);
        }
        else
        {
            return getArray(nums2,nums1);
        }
    }
    
    public int[] getArray(int[] nums1, int[] nums2)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        
        for(int i = 0; i < nums1.length; i++)
        {
            if(!hashmap.containsKey(nums1[i]))
            {
                hashmap.put(nums1[i], 1);
            }
            else
            {
                hashmap.put(nums1[i], hashmap.get(nums1[i]) + 1);
            }
        }
        
        
        for(int i = 0; i < nums2.length; i++)
        {
            if(hashmap.containsKey(nums2[i]) && hashmap.get(nums2[i]) != 0)
            {
                list.add(nums2[i]);
                hashmap.put(nums2[i], hashmap.get(nums2[i]) - 1);
            }
        }
        
        int[] array = new int[list.size()];
        for(int i =0; i < list.size(); i++)
        {
            array[i] = list.get(i);
        }
        
        return array;
    }
}