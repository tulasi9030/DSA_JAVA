class Solution 
{
    public int maxDistance(int[] colors) 
    {
        int n = colors.length,distance = 0 ;
        int r=0,l=0;
        for(int i=0;i<n;i++)
        {
            if(colors[i]!=colors[n-1])
            {
                r=i;
                break;
            }
        }
        for(int j = n-1;j>=0;j--)
        {
            if(colors[j]!=colors[0])
            {
                l=j;
                break;
            }
        }
        return Math.max(n-1-r,l);
    }
}
