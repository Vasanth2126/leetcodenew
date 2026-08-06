class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=n+t;i++)
        {
            int c=1;
            int cur=i;
            while(cur>0)
            {
                c=c*(cur%10);
                cur/=10;
            }
            if(c%t==0)
            {
                return i;
            }
        }
        return n;
    }
}
