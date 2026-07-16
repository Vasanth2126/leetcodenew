class Solution {
    public String val="";
    public boolean pal(String a)
    {
        int i=0,j=a.length()-1;
        while(i<j)
        {
            if(a.charAt(i)!=a.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        for(int left=0;left<s.length();left++)
        {
            for(int right=left;right<s.length();right++)
            {
                String a=s.substring(left,right+1);
                if(pal(a)&& a.length()>val.length())
                {
                    val=a;
                }
            }
        }
        return val;
    }
}
