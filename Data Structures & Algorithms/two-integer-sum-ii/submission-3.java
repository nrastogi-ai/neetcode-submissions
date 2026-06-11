class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        HashMap <Integer,Integer> count = new HashMap<>();
        int arr[] = new int[2];
        for (int i = 0 ; i<numbers.length;i++)
        {

            count.put (numbers[i], i);
        }
        for (int i = 0 ; i<numbers.length;i++)
        {
            int num = numbers[i];
            int diff= target-num;
            if (diff!=num && count.get(diff)!=null)
            {
                arr[0]=i+1;
                arr[1]=count.get(diff)+1;
                break;
            }
        }
        return arr;
    }
}
