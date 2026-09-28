class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int r=intervals.length;
        int c=intervals[0].length;
        int count=0;
        for(int i=0;i<r-1;i++)
        {
            for(int j=i+1;j<r;j++)
            {
                if(intervals[i][1]>=intervals[j][0] && intervals[i][0]<=intervals[j][1])
                {
                    count++;
                }
            }
        }
        return count;
    }
}
