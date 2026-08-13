class Solution 
{
    public int[] findErrorNums(int[] nums) 
    {
        int arr [] = new int[2];
        HashSet <Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hs.contains(nums[i]))
            {
                arr[0]=nums[i];
            }
            else 
                hs.add(nums[i]);
        }    
        for(int i = 1;i<=nums.length;i++)
        {
            if(!hs.contains(i))
            {
                arr[1]= i;
                break;
            }
        }
        return arr;
    }
}
