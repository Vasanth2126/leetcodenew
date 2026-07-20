class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                list.add(grid[i][j]);
            }
        }
        Collections.rotate(list,k);
        int z=0;
        List<List<Integer>> mainlist=new ArrayList<>();
        for(int i=0;i<grid.length;i++)
        {
            List<Integer> c=new ArrayList<>();
            for(int j=0;j<grid[0].length;j++)
            {
              c.add(list.get(z));
              z++;
            }
            mainlist.add(c);
        }
        return mainlist;
    }
}
