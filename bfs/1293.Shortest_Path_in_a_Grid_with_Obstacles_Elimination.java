class Solution {
    public int shortestPath(int[][] grid, int k) {
        int r=grid.length;
        int c=grid[0].length;
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{0,0,0,k});
        boolean[][][]vis=new boolean[r][c][k+1];
        vis[0][0][k]=true;
        int[]dr={-1,1,0,0};
        int[]dc={0,0,-1,1};
      //  int dist=0;
        while(!q.isEmpty())
        {
            int[]con=q.poll();
            int R=con[0];
            int C=con[1];
            int dis=con[2];
            int rem=con[3];
            if(R==r-1 && C==c-1)
            {
                return dis;
            }
            for(int i=0;i<4;i++)
            {
                int nr=R+dr[i];
                int nc=C+dc[i];
                if(nr>=0 && nr<r && nc>=0 && nc<c)
                {
                    int nrem=rem;
                    if(grid[nr][nc]==1)
                    {
                        nrem--;
                    }
                    if(nrem>=0 && !vis[nr][nc][nrem])
                    {
                        vis[nr][nc][nrem]=true;
                        q.add(new int[]{nr,nc,dis+1,nrem});
                    }
                    
                }
            }
        }
        return -1;
    }
}
