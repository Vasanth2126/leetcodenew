class Solution {
    public boolean back(char[][]board,String word,int index,int i,int j,boolean[][]vis)
    {
        if(i<0||j<0||i>=board.length||j>=board[0].length||vis[i][j])
        {
            return false;
        }
        if(board[i][j]!=word.charAt(index))
        {
            return false;
        }
        if(index==word.length()-1)
        {
            return true;
        }
        vis[i][j]=true;
        if(back(board,word,index+1,i+1,j,vis)) return true;
        if(back(board,word,index+1,i,j+1,vis)) return true;
        if(back(board,word,index+1,i-1,j,vis)) return true;
        if(back(board,word,index+1,i,j-1,vis)) return true;
        vis[i][j]=false;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                boolean[][]vis=new boolean[board.length][board[0].length];
                if(back(board,word,0,i,j,vis))
                {
                    return true;
                }
            }
        }
        return false;
    }
}
