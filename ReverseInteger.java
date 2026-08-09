class Solution 
{
    public int reverse(int x) 
    {
        long sum = 0;
        int sign = 1;
        long xl = x;      
        if (xl < 0)
        {
            sign = -1;
            xl = -xl;      
        }
        while (xl != 0)
        {
            long i = xl % 10;
            sum = sum * 10 + i;
            xl = xl / 10;
            if (sign * sum > Integer.MAX_VALUE || sign * sum < Integer.MIN_VALUE)
            {
                return 0;
            }
        }    
        return (int) (sign * sum);  
    }
}
