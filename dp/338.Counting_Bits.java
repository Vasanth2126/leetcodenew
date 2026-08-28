class Solution {
    public int[] countBits(int n) {
        int[]a=new int[n+1];
        a[0]=0;
        for(int i=1;i<n+1;i++)
        {
            int t=i;
            int count=0;
            while(t>0)
            {
                if(t%2==1)
                {
                    count++;
                }
                t/=2;
            }
            a[i]=count;
        }
       return a;
    }
}
