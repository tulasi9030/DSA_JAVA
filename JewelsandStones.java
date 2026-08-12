class Solution 
{
    public int numJewelsInStones(String jewels, String stones) 
    {
        // int count=0;
        // for(int i=0;i<jewels.length();i++)
        // {
        //     char temp=jewels.charAt(i);
        //     for(int j=0;j<stones.length();j++)
        //     {
        //         if(temp==stones.charAt(j))
        //             count++;
        //     }
        // }    
        // return count;
        HashMap <Character , Integer> map = new HashMap<>();
        for(int i=0;i<stones.length();i++)
        {
            if(map.containsKey(stones.charAt(i)))
                map.put(stones.charAt(i),map.get(stones.charAt(i))+1);
            else 
                map.put(stones.charAt(i),1);
        }
        int ans =0;
        for(int i=0;i<jewels.length();i++)
        {
            if(map.containsKey(jewels.charAt(i)))
                ans+=map.get(jewels.charAt(i));
        }
        return ans;
        
    }
}
