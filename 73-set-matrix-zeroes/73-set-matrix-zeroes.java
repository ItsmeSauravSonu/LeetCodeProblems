class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        ArrayList<Integer> r1 = new ArrayList<>();
        ArrayList<Integer> c1 = new ArrayList<>();
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    r1.add(i);
                    c1.add(j);
                }
            }
        }
        
        // System.out.println(r1);
        // System.out.println(c1);
        
        for(int x: r1){
            for(int i=0;i<col;i++){
                matrix[x][i]=0;
            }
        }
        
        for(int y: c1){
            for(int i=0;i<row;i++){
                matrix[i][y]=0;
            }
        }
        
    }
}