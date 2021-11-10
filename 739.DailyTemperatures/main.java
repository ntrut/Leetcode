class Solution {
    public int[] dailyTemperatures(int[] temperatures) 
    {
        //ArrayList<Integer> arraylist = new ArrayList<>();
        if(temperatures.length == 0)
        {
            return temperatures;
        }
        int[] answer = new int[temperatures.length];
        
        for(int i = 0; i < temperatures.length; i++)
        {
            int currentTemp = temperatures[i];
            int count = 0;
            if(i + 1 == temperatures.length)
            {
                //arraylist.add(0);
                answer[i] = 0;
                break;
            }
            for(int j = i + 1; j < temperatures.length; j++)
            {
                count++;
                if(currentTemp < temperatures[j])
                {
                    //arraylist.add(count);
                    answer[i] = count;
                    break;
                }
            }
        }
        
        return answer;
    }
}