class Solution {
    public int[] shortestToChar(String s, char c) {
        int[]a=new int[s.length()];
        int[]b=new int[s.length()];
        int v=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            {
                a[v++]=i;
            }
        }
        for(int i=0;i<s.length();i++)
        {
            int min=Integer.MAX_VALUE;
            for(int j=0;j<v;j++)
            {
                min=Math.min(min,Math.abs(i-a[j]));
            }
            b[i]=min;
        }
        return b;
    }
}