class Solution 
{
    public int minEatingSpeed(int[] piles, int h) 
    {

        int max=0;
        for(int num :piles)
        {
            max=Math.max(max,num);
        }
        int l=1;
        int r= max;
        int mink=max;
        int count =0;
        while(r>=l)
        {
            count =0;
            int m = l+(r-l)/2;
            for(int num:piles)
            {
                count = count +(int) Math.ceil((num*1.0)/m);
            }
            if (count<=h)
            {
                mink=Math.min(mink,m);
                r=m-1;
            }
            else
            {
                l=m+1;
            }

        }
        return mink;
    }
}
