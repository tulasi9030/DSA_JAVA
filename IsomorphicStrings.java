class Solution 
{
    public boolean isIsomorphic(String s, String t) 
    {
        boolean isomorphic = true ;
        HashMap <Character,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                if(map.get(s.charAt(i))!=t.charAt(i) )
                {
                    isomorphic = false ;
                    break;
                }
            }
            else if(map.containsValue(t.charAt(i)))
            {
                isomorphic = false;
                break;
            }
            else
                map.put(s.charAt(i),t.charAt(i));
        }
        return isomorphic;
    }
}
