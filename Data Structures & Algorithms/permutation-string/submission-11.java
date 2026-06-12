class Solution 
{
    public boolean checkInclusion(String s1, String s2) 
    {
        boolean flag = false;
        if (s1.length()>s2.length())
        {
            flag= false;
        }
        else
        {
        int l = 0;
        int r = s1.length();
        HashMap <Character, Integer> count = new HashMap<>();
         
        for(int i = 0 ; i<s1.length();i++)
        {
            count.put(s1.charAt(i),count.getOrDefault(s1.charAt(i),0)+1);
        } 
        while(r<=s2.length())
        {
            String s = s2.substring(l,r);
            HashMap <Character, Integer> count1 = new HashMap<>();
            
         for(int i = 0 ; i<s1.length();i++)
        {
            count1.put(s.charAt(i),count1.getOrDefault(s.charAt(i),0)+1);
        } 
                 for(int i = 0 ; i<s1.length();i++)
        {
            if (count1.get(s1.charAt(i))==count.get(s1.charAt(i)))
            {
                flag=true;
            }
            else
            {
                flag = false;
                break;
            }
        } 

        if (flag == true)
        {
            break;
        }
            l++;
            r++;
        }
        }
        return flag;
    }
}
