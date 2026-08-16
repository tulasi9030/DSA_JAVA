class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {
        int first = binarySearch(nums,target,true);
        if(first==-1)
            return new int[]{-1,-1};
        int last = binarySearch(nums,target,false);
        return new int[]{first,last};
    }
    private int binarySearch(int nums[],int target,boolean leftmost)
    {
        int index = -1, low = 0, high = nums.length-1;
        while(low <= high)
        {
            int mid = (low + high) >>> 1;
            if(nums[mid]<target)
                low = mid+1;
            else if(nums[mid] > target )
                high = mid -1;
            else 
            {
                index = mid ;
                if(leftmost)    high = mid -1;
                else  low = mid +1;
            }
        }
        return index;
    }
}
