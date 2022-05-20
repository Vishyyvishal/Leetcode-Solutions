class Solution {
    int x;
    int y;
    char[][] g; 
    
    public int numIslands(char[][] grid) {
        // storing the grid to save memory usage from recursion
        g = grid;
        
        // count for number of islands
        int count = 0;
        
        // Dimensions of the given grid
        y = grid.length;
        if(y == 0) return 0;
        x = g[0].length;
        
        for(int i = 0; i < y; i++) {
            for(int j = 0; j < x; j++) {
                if(g[i][j] == '1') {
                    dfs(i, j);
                    count++;
                }
            }
        }
        return count;
    }
    
    
    private void dfs(int i, int j) {
        // If i,j has fallen off OR the spot is water or been visited 
        // then early return
        if(i < 0 || i >= y || j < 0 || j >= x || g[i][j] != '1') return;
        
        g[i][j] = '0';
        
        dfs(i + 1, j);
        dfs(i - 1, j);
        dfs(i, j + 1);
        dfs(i, j - 1);
        
    }
}