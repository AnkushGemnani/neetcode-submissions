class Solution {

    public int numIslands(char[][] grid) {

        // Stores the total number of islands found
        int islands = 0;

        // Traverse every row
        for (int row = 0; row < grid.length; row++) {

            // Traverse every column
            for (int col = 0; col < grid[0].length; col++) {

                // If we find an unvisited land
                if (grid[row][col] == '1') {

                    // We found a completely new island
                    islands++;

                    // Visit the entire connected island
                    // and mark every connected land as visited
                    dfs(grid, row, col);
                }
            }
        }

        // Return total islands
        return islands;
    }


    // DFS explores one complete island
    private void dfs(char[][] grid, int row, int col) {

        // ---------------- BASE CASES ----------------

        // Outside the grid
        if (row < 0 ||
            col < 0 ||
            row >= grid.length ||
            col >= grid[0].length) {

            return;
        }

        // If current cell is water OR already visited
        // ('0' means either water or land that we already processed)
        if (grid[row][col] == '0') {
            return;
        }

        // ---------------- PROCESS CURRENT CELL ----------------

        // Mark current land as visited
        // We convert land into water so we don't visit it again
        grid[row][col] = '0';

        // ---------------- EXPLORE ALL 4 DIRECTIONS ----------------

        // Down
        dfs(grid, row + 1, col);

        // Up
        dfs(grid, row - 1, col);

        // Right
        dfs(grid, row, col + 1);

        // Left
        dfs(grid, row, col - 1);
    }
}