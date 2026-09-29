class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
        int n=intervals.length;
        int[]st=new int[n];
        int[]en=new int[n];
        for(int i=0;i<n;i++)
        {
            st[i]=intervals[i][0];
            en[i]=intervals[i][1];
        }
        Arrays.sort(st);
        Arrays.sort(en);
        int  i=0,j=0;
        long count=0;
        long active=0;

        while(i<n)
        {
            if(st[i]<=en[j])
            {
                count+=active;
                active++;
                i++;
            }
            else
            {
                active--;
                j++;
            }
        }
        return count;
    }
}
