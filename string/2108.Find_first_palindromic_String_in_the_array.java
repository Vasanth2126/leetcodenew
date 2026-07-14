class Solution {
    public String firstPalindrome(String[] words) {
        for(int k=0;k<words.length;k++)
        {
            int i=0,j=words[k].length()-1;
            while(i<j)
            {
                if(words[k].charAt(i)!=words[k].charAt(j))
                {
                    break;
                }
                i++;
                j--;
            }
                if(i>=j)
                {
                    return words[k];
                }
        }
        return "";
    }
}