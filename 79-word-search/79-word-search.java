class Solution {
    public boolean exist(char[][] board, String word) {
      boolean[][] visited=new boolean[board.length][board[0].length];
for(int i=0;i<board.length;i++){
for(int j=0;j<board[0].length;j++){
if(word.charAt(0)==board[i][j] && isMatch(board,i,j,word,0,visited)){
return true;
}
}
}
return false;
}
public boolean isMatch(char[][] arr,int i,int j,String s,int ct,boolean[][] isVisited){
if(ct==s.length()){
return true;
}
if(i<0 || i>=arr.length || j<0 || j>=arr[0].length || s.charAt(ct)!=arr[i][j] || isVisited[i][j]){
return false;
}
isVisited[i][j]=true;
if(isMatch(arr,i-1,j,s,ct+1,isVisited) || isMatch(arr,i+1,j,s,ct+1,isVisited) ||
isMatch(arr,i,j-1,s,ct+1,isVisited) || isMatch(arr,i,j+1,s,ct+1,isVisited)){
return true;
}
isVisited[i][j]=false;
return false;  
    }
}