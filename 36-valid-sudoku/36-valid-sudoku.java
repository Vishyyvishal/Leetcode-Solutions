class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] != '.') {
                    int current = board[i][j];
                    if(!set.add(current + "is in row " + i) || !set.add(current + "is in col " + j) || !set.add(current + "is in 3x3 " + i/3 + j/3)) {
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}
