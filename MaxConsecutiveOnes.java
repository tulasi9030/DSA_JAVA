class Solution 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int CurrentSequence = 0 , MaxSequence = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
                CurrentSequence++;
            else 
            {
                MaxSequence = Math.max(MaxSequence,CurrentSequence);
                CurrentSequence=0;
            }
        }
        return Math.max(MaxSequence,CurrentSequence);
    }
}
