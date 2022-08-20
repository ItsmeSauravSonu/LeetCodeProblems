class Solution {
    public int finalValueAfterOperations(String[] operations) {
       int x = 0;
       int n = operations.length;
       String [] ops = {"++X","X++","--X","X--"};
       for(int i=0;i<n;i++){
          String y = operations[i];
          if(y.equals(ops[0])) x=x+1;
          if(y.equals(ops[1])) x=x+1;
          if(y.equals(ops[2])) x=x-1;
          if(y.equals(ops[3])) x=x-1;
       }
        return x;
    }
}