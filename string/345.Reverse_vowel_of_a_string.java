class Solution {
    public boolean vow(char ch)
    {
        ch=Character.toUpperCase(ch);
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        {
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        char[] str=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j)
        {
            while(i<j && !vow(str[i]))
            {
                i++;
            }
            while(i<j && !vow(str[j]))
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