class Solution {
    public int maxProduct(int n) {
        String a=String.valueOf(n);
        String[]ar=a.split("");
        int max=0;
        for(int i=0;i<ar.length-1;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                max=Math.max(max,(a.charAt(i)-'0')*(a.charAt(j)-'0'));
            }
        }
        return max;
    }
}
