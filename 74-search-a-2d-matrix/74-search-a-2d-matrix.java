class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        
        for(int i=0; i<r; i++){
            for(int j = c-1; j>=0; j--){
                if(target == matrix[i][j])
                    return true;
                if(target > matrix[i][j])
                    break;
                
            }
        }
            
        return false;
    }
}