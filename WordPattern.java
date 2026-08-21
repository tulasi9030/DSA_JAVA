class Solution 
{
    public boolean wordPattern(String pattern, String s) 
    {
        String [] arr = s.split(" ");
        if (arr.length != pattern.length()) return false;
        HashMap <Character , String> charToString = new HashMap<>();
        HashMap < String , Character> StringToChar = new HashMap <>();
        for(int i=0;i<pattern.length();i++)
        {
            if(!charToString.containsKey(pattern.charAt(i)))    charToString.put(pattern.charAt(i),arr[i]);
            else if(!charToString.get(pattern.charAt(i)).equals(arr[i]))    return false;
            if(!StringToChar.containsKey(arr[i]))   StringToChar.put(arr[i],pattern.charAt(i));
            else if(StringToChar.get(arr[i])!=pattern.charAt(i))    return false;
        }
        return true;
    }
}
