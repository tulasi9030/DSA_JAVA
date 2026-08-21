class Solution 
{
    public int singleNumber(int[] nums) 
    {
        int result = 0;
        for(int i : nums)
            result ^= i;
        return result;
    }
}
//x^x=0 , x^0 = x
