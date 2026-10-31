class Solution {
    int ans;
    boolean[][][] vis;

    public int minCost(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        ans = Integer.MAX_VALUE;

        vis = new boolean[r][c][1024];

        back(0, 0, grid, 0);

        return ans;
    }

    public void back(int i, int j, int[][] grid, int val) {

        val ^= grid[i][j];

        if (ans == 0) {
            return;
        }

        if (vis[i][j][val]) {
            return;
        }

        vis[i][j][val] = true;

        int r = grid.length;
        int c = grid[0].length;

        if (i == r - 1 && j == c - 1) {
            ans = Math.min(ans, val);
            return;
        }

        if (i + 1 < r) {
            back(i + 1, j, grid, val);
        }

        if (j + 1 < c) {
            back(i, j + 1, grid, val);
        }
    }
}
