class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        HashMap <Character,Integer> index = new HashMap<>();
        
        int l=0;
        int r=0;
        int i =0;
        int maxlength=0;
        while( r<s.length())
        {
            char c= s.charAt(r);
            if (index.get(c)!=null)
            {
                if(index.get(c)>=l)
                {
                    l=index.get(c)+1;

                }
            }     
            maxlength = Math.max(maxlength, r-l+1);
            index.put(c,r);
            r++;
        }
        return maxlength;
    }
}
