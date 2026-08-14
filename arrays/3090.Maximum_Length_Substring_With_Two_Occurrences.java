class Solution {
    public int maximumLengthSubstring(String s) {
        int[]a=new int[26];
        int left=0,right=0;
        int max=0;
        for(right=0;right<s.length();right++)
        {
            a[s.charAt(right)-'a']++;
            while(a[s.charAt(right)-'a']>2)
            {
                a[s.charAt(left)-'a']--;
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}
