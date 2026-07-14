class Solution {
    public boolean isPalindrome(String s) {
        String a="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c>='a' && c<='z')
            {
                a+=c;
            }
            else if(c>='A' && c<='Z')
            {
                a+=(char)(c+32);
            }
            else if(c>='0' && c<='9')
            {
                a+=c;
            }
        }
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
}