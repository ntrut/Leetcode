class Solution {
    public boolean exist(char[][] board, String word) 
    {
        if(board.length == 0)
        {
            return false;
        }
        //System.out.println(board[0].length);
        //System.out.println(board.length);
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[i].length; j++)
            {
                //find the first letter, then use exists to see if word exists
                //System.out.println("i: " + i + " j:" + j);
                //System.out.println(board[i][j]);
                if(board[i][j] == word.charAt(0))
                {
                    boolean[][] board2 = new boolean[board.length][board[i].length];
                    if(exists(word, board, i, j, 0, board2))
                    {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
    
    public boolean exists(String word, char[][] board, int i, int j, int current, boolean[][] board2)
    {   
        if(current == word.length())
        {
            //System.out.println("1");
            return true;
        }
        if(j < 0 || i < 0 || i == board.length || j == board[i].length || (board2[i][j] == true))
        {
            // System.out.println("2");
            return false;
        }
        if(word.charAt(current) != board[i][j])
        {
             //System.out.println("3");
            return false;
        }
     
     
        if(word.charAt(current) == board[i][j])
        {
            board2[i][j] = true;
            //go up
            if(exists(word, board, i+1, j, current+1, board2))
            {
                return true;
            }
            //go down
            if(exists(word, board, i-1, j, current+1, board2))
            {
                return true;
            }
            //go east
            if(exists(word, board, i, j+1, current+1, board2))
            {
                return true;
            }
            //go west
            if(exists(word, board, i, j-1, current+1, board2))
            {
                return true;
            }
            board2[i][j] = false;
        }
        
        return false;
    }
}