class Solution {
    public boolean vow(char c)
    {
        return (c=='a' ||c=='e'||c=='i'||c=='o'||c=='u');
    }
    public int maxVowels(String s, int k) {
        int max=0;
        int count=0;
        for(int i=0;i<k;i++)
        {
            if(vow(s.charAt(i)))
            {
                count++;
            }
        }
        max=count;
        int i=0,j=k;
        while(j<s.length())
        {
            if(vow(s.charAt(i)))
            {
                count--;
            }
            if(vow(s.charAt(j)))
            {
                count++;
            }
            max=Math.max(max,count);
            if(max==k)
            {
                return max;
            }
            i++;
            j++;
        }
        return max;
    }
}