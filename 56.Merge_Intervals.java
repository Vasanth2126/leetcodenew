class Solution {
    public int[][] merge(int[][] intervals) {
        //ArrayList<int[]>list=new ArrayList<>();
        int[][]nw=new int[intervals.length][2];
        int ind=0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int s=intervals[0][0];
        int e=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<=e)
            {
                e=Math.max(e,intervals[i][1]);
            }
            else
            {
                nw[ind][0]=s;
                nw[ind][1]=e;
                ind++;
                s=intervals[i][0];
                e=intervals[i][1];
            }
        }
        //list.add(new int[]{s,e});
         nw[ind][0]=s;
         nw[ind][1]=e;
        return Arrays.copyOf(nw, ind + 1);

    }
}
