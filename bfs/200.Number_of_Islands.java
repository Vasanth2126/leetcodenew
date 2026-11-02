class Solution {
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        boolean[][]vis=new boolean[r][c];
        Queue<int[]>q=new LinkedList<>();
        int count=0;
        int[]dr={-1,1,0,0};
        int[]dc={0,0,-1,1};
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(!vis[i][j] && grid[i][j]=='1')
                {
                    q.add(new int[]{i,j});
                    vis[i][j]=true;
                    count++;
                    while(!q.isEmpty())
                    {
                        int[]con=q.poll();
                        int R=con[0];
                        int C=con[1];
                        for(int z=0;z<4;z++)
                        {
                            int nr=R+dr[z];
                            int nc=C+dc[z];
                            if(nr>=0 && nc>=0 && nr<r && nc<c &&grid[nr][nc]=='1' && !vis[nr][nc] ){
                                q.add(new int[]{nr,nc});
                                vis[nr][nc]=true;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}
