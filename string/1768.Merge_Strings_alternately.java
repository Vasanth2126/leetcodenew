class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        String nw="";
        while(word1.length()>i && word2.length()>j)
        {
            if(i<=j)
            {
                nw+=word1.charAt(i);
                i++;
            }
            else
            {
                nw+=word2.charAt(j);
                j++;
            }
        }
        while(word1.length()>i)
        {
            nw+=word1.charAt(i);
            i++;
        }
        while(word2.length()>j)
        {
            nw+=word2.charAt(j);
            j++;
        }
        return nw;
    }
}n