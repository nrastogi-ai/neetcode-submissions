class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        int l =0;
        HashMap <Integer, Integer>count = new HashMap<>();
        boolean flag= false;
        while(l<nums.length)
        {
            if (count.get(nums[l])==null)
            count.put(nums[l],l);
            else
            {
                if(Math.abs(l-count.get(nums[l]))<=k)
                {
                    flag= true;
                    break;
                }
                else
                {
                    flag = false;
                    count.put(nums[l],l);
                }
            }
            l++;
        }
        return flag;
    }
}