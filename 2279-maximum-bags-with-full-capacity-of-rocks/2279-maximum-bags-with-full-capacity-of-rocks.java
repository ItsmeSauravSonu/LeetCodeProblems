class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
      int [] req = new int[rocks.length];
      for(int i=0;i<rocks.length;i++)
      {
          req[i]=capacity[i]-rocks[i];
      }
      Arrays.sort(req);
      int ans = 0;
      for(int i=0;i<req.length;i++)
      {
          if(req[i]<=additionalRocks){
              ans++;
              additionalRocks = additionalRocks - req[i];
          }
      }
      return ans;
    }
}