class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        if(strs.length== 0 ) return "";
        String check ="";
        int j=0;
        boolean match = true;
        while(match)
        {
            if(j>=strs[0].length()) break;
            char ch = strs[0].charAt(j);
            for(int k =1;k<strs.length;k++)
            {
                if(j>=strs[k].length()||strs[k].charAt(j)!=ch)
                {
                    match = false ;
                    break;
                }
            }
            if(match==true)
            {
                check += ch;
                j++;
            }
        }
        return check;
    }
}
