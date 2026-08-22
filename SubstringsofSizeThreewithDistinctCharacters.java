class Solution 
{
    public int countGoodSubstrings(String s) 
    {
        // int count =0;
        // int l=0;
        // HashMap <Character , Integer> map = new HashMap<>();
        // for(int r=0;r<s.length();r++)
        // {
        //     if(r-l==3)
        //     {
        //         map.put(s.charAt(l),map.get(s.charAt(l))-1);
        //         if(map.get(s.charAt(l))==0) map.remove(s.charAt(l));
        //         l++;
        //     }
        //     char right=s.charAt(r);
        //     map.put(right, map.getOrDefault(right, 0) + 1);
        //     if(r-l+1==3 && map.size()==3)   count++;
        // }  
        int count=0;
        for(int i=0;i<s.length()-2;i++)
        {
            char a=s.charAt(i),b=s.charAt(i+1),c=s.charAt(i+2);
            if(a!=b && b!=c && a!=c)    count++;
        }
        return count;
    }
}
