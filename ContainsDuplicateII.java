class Solution 
{
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        HashMap <Integer , Integer > last= new HashMap<> ();
        for(int i=0;i<nums.length ;i++)
        {
            int number = nums[i];
            if(last.containsKey(number) && (Math.abs(i- last.get(number))<=k))
                return true;
            last.put(number,i);
        }
        return false;
    }
}
