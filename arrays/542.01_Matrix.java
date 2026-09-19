class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        int[][]dist=new int[r][c];
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(mat[i][j]==0)
                {
                    dist[i][j]=0;
                    q.add(new int[]{i,j,0});
                }
            }
        }
        boolean[][]vis=new boolean[mat.length][mat[0].length];
        int[]dr={-1,1,0,0};
        int[]dc={0,0,-1,1};
        while(!q.isEmpty())
        {
            int[] con=q.poll();
            int R=con[0];
            int C=con[1];
            int dis=con[2];
            for(int i=0;i<4;i++)
            {
                int nr=R+dr[i];
                int nc=C+dc[i];
                if(nr>=0 && nc>=0 && nr<r && nc<c && mat[nr][nc]!=0 && !vis[nr][nc])
                {
                    q.add(new int[]{nr,nc,dis+1});
                    vis[nr][nc]=true;
                    dist[nr][nc]=dis+1;
                }
            }
        }
        return dist;
    }
}
