class Solution 
{
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> arr = new ArrayList<>();
        List <Integer> temp = new ArrayList<>();
        temp.add(1);
        arr.add(temp);
        for(int i=1;i<numRows;i++)
        {
            List <Integer> temp1 = new ArrayList<>();
            temp1.add(1);
            for(int j=1;j<i;j++)
                temp1.add(arr.get(i-1).get(j-1)+arr.get(i-1).get(j));
            temp1.add(1);
            arr.add(temp1);
        }
        return arr;
    }
}
