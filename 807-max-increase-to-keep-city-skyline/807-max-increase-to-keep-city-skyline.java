class Solution {
    /*
    
    3 0 8 4        =====   8,9 
    2 4 5 7
    9 2 6 3
    0 3 1 0
    */
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        
        
        //Step1: store the max of every row and column, taaki baar baar max calculate nahi karna pade.
        int[] rowMax=new int[row];
        int[] colMax=new int[col];
        
        for(int i=0;i<row;i++){
            int maxInRow=Integer.MIN_VALUE;
            for(int j=0;j<col;j++){
                maxInRow=Math.max(maxInRow,grid[i][j]);
            }
            rowMax[i]=maxInRow;
        }
        
        for(int i=0;i<col;i++){
            int maxInCol=Integer.MIN_VALUE;
            for(int j=0;j<row;j++){
                maxInCol=Math.max(maxInCol,grid[j][i]);
            }
            colMax[i]=maxInCol;
        }
        
        
        //step2(Most crucial Step): Har ek element ke liye uske row ka max, and uske col ka max nikal lo. The maximum height we can increase will be the minimum out of these two. Line 35 pe ye ho rha hai.
        int sum=0;
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int maxIncrease=Math.min(rowMax[i],colMax[j]);
                //now we calculate by how much can we increase our element.
                int increaseBy=maxIncrease-grid[i][j];
                //agar increaseBy positive ho tab hi sum me add karo, otherwise negative hua toh hamara sum decrease ho jaega, aur answer galat aaega.
                if(increaseBy>0){
                    sum+=increaseBy;
                }
            }
        }
        
        return sum;
    }
}  