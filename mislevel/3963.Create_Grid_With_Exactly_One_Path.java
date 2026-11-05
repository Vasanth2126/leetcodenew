class Solution {
    public char[][]grid; 
    public String[] createGrid(int m, int n) {
        grid=new char[m][n];
        for(int i=0;i<m;i++)
        {
            Arrays.fill(grid[i],'#');
        }
        for(int i=0;i<m;i++)
        {
            grid[i][0]='.';
        }
        for(int i=0;i<n;i++)
        {
            grid[m-1][i]='.';
        }
        String[] ret=new String[m];
        for(int i=0;i<m;i++)
        {
            String a="";
            for(int j=0;j<n;j++)
            {
                a+=grid[i][j];
            }
            ret[i]=a;
        }
        return ret;
    }
}
