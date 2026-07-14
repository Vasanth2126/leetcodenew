class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        int j=0;
        if(s.length()>j)
        {
        for(char x:t1)
        {
           if(x==s1[j])
           {
            j++;
            if(j==s.length())
            {
                return true;
            }
           }
        }
        }
        return (j==s1.length);
    }
}