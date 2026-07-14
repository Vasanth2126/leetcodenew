class Solution {
    public boolean cha(char ch)
    {
        if(ch>='A' && ch<='Z')
            return true;
        else if(ch>='a' && ch<='z')
            return true;
        return false;
    }
    public String reverseOnlyLetters(String s) {
        int i=0,j=s.length()-1;
        char[] str=s.toCharArray();
        while(i<j)
        {
            while(i<j && !cha(str[i]))
            {
                i++;
            }
            while(i<j && !cha(str[j]))
            {
                j--;
            }
            char c=str[i];
            str[i]=str[j];
            str[j]=c;
            i++;
            j--;
        }
        return new String(str);
    }
}