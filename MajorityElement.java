class Solution 
{
    public int majorityElement(int[] nums) 
    {
        HashMap < Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
        }
        int max = Integer.MIN_VALUE,element=0;
        for(int x : map.keySet())
        {
            if(map.get(x)>max)
            {
                max= map.get(x);
                element = x;
            }
        }
        return element;
    }
}
