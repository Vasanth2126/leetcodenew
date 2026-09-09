class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int orange=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new int[]{i,j,0});
                }
                if(grid[i][j]==1)
                {
                    orange++;
                }
            }
        }
        boolean[][]vis=new boolean[grid.length][grid[0].length];
        int[]dr={-1,1,0,0};
        int[]dc={0,0,-1,1};
        int distance=0;
        while(!q.isEmpty() && orange>0)
        {
            int[] con=q.poll();
            int R=con[0];
            int C=con[1];
            int dist=con[2];
            for(int i=0;i<4;i++)
            {
                int nr=R+dr[i];
                int nc=C+dc[i];
                if(nc>=0 && nr>=0 && nr<grid.length && nc<grid[0].length && !vis[nr][nc] && grid[nr][nc]==1)
                {
                    vis[nr][nc]=true;
                    distance=dist+1;
                    q.add(new int[]{nr,nc,dist+1});
                    orange--;
                }
            }
        }
        if(orange<=0)
        {
            return distance;
        }
        return -1;
    }
}
