class Solution {
    public int numIslands(char[][] grid) 
    {
        int islands = 0;
        
        for(int i = 0; i < grid.length; i++)
        {
            for(int j =0; j< grid[i].length; j++)
            {
                //System.out.print(grid[i][j] + " ");
                if(grid[i][j] == '1')
                {
                    traverseIsland(i,j,grid);
                    islands++;
                }
            }
            //System.out.println("");
        }
        
        return islands;
    }
    
    public void traverseIsland(int i, int j, char[][] grid)
    {
        if(i > grid.length - 1 || i < 0)
        {
            return;
        }
        
        else if(j > grid[i].length - 1 || j < 0)
        {
            return;
        }
        else if(grid[i][j] == '0')
        {
            return;
        }
        else
        {
            grid[i][j] = '0';
            //traverse all possible directions
            traverseIsland(i + 1, j, grid);
            traverseIsland(i, j + 1, grid);
            traverseIsland(i - 1, j, grid);
            traverseIsland(i, j - 1, grid);
        }
        
    }
}