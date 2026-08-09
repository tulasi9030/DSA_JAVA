class Solution 
{
    public int maximumDifference(int[] nums) 
    {
        int min=Integer.MAX_VALUE,profit=0;
        for (int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
                min = nums[i];
            else if(nums[i]-min>profit)
                profit=nums[i]-min;
        }    
        if(profit>0)
            return profit;
        else 
            return -1;
    }
}
