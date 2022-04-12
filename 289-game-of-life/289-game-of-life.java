class Solution {
    public void gameOfLife(int[][] board) {
        
		if(board == null || board.length == 0) 
			return;
		
		int[][] res = new int[board.length][board[0].length];
		
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				int curr = 0;
				//00 10 11
				//10 11 12
				//20 21 22
				//assume you are at 11 position in above metrics and visit all directions
				 curr = cal(board,i - 1, j - 1) + cal(board,i - 1, j) + cal(board,i - 1, j + 1) + 
				           cal(board,i, j - 1) +  cal(board,i, j + 1) +
				           cal(board,i + 1, j - 1) + cal(board,i + 1, j) + cal(board,i + 1, j + 1);
				 
				if(board[i][j] == 1){
					 if(curr < 2){
						 res[i][j] = 0;
					 }else if(curr == 2 || curr == 3)
						 res[i][j] = 1;
					 else if(curr > 3)
						 res[i][j] = 0;
				}else{
					if(curr == 3)
						res[i][j] = 1;
				}
				
			}
		}
		
		
		for(int i=0; i<board.length; i++)
			  for(int j=0; j<board[i].length; j++)
				  board[i][j]=res[i][j];
	
        
    }
    
    
    private int cal(int[][] board, int i, int j) {
		
		if(i >= 0 && i < board.length && j >= 0 && j < board[0].length)
			return board[i][j];
		return 0;
    }
}