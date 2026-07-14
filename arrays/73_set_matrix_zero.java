class Solution {
    public void setZeroes(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    for(int z=0;z<matrix[0].length;z++)
                    {
                        if(matrix[i][z]!=0)
                        {
                        matrix[i][z]=-11111111;
                        }
                    }
                    for(int z=0;z<matrix.length;z++)
                    {
                        if(matrix[z][j]!=0)
                        {
                        matrix[z][j]=-11111111;
                        }
                    }
                }
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==-11111111)
                {
                    matrix[i][j]=0;
                }
            }
        }
        //return matrix;
    }
}