class Solution {
    public int brokenCalc(int st, int ta) {
        int mn = 0;
          while( st <ta){
                  if( ta%2!=0) mn+=2;
                  else mn++;
                  ta=(ta+1)>>1;
          }
            return  mn+( st-ta);
    }
}