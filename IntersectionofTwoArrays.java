class Solution 
{
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        ArrayList <Integer> arraylist = new ArrayList<>();
        HashMap <Integer,Integer> set = new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(!set.containsKey(nums1[i]))  set.put(nums1[i],0);
        }    
        for(int i=0;i<nums2.length;i++)
        {
            if(set.containsKey(nums2[i]) && set.get(nums2[i])==0)
            {
                arraylist.add(nums2[i]);
                set.put(nums2[i],set.get(nums2[i])+1);
            }
        }
        int arr[] = new int[arraylist.size()];
        for(int i=0;i<arraylist.size();i++)
            arr[i] = arraylist.get(i);
        return arr;
    }
}
