class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        // int noOfZeros = 0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==0)  noOfZeros ++;
        //     else if(noOfZeros>0)
        //     {
        //         int temp = nums[i];
        //         nums[i] = 0;
        //         nums[i-noOfZeros] = temp;
        //     }
        // }
        int []temp= Arrays.copyOf(nums,nums.length);
        int count =0 ;
        for(int i=0;i<nums.length;i++)
        {
            if(temp[i]!=0)
            {
                nums[count]= temp[i];
                count++;
            }
        }
        for(int i = count;i<nums.length;i++)
            nums[i]=0;
    }
}
