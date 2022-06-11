class Solution {
    public long wonderfulSubstrings(String word) {
       long result = 0l;
       int mask = 0;
       int [] count = new int[1024];
        count[0]=1;
       for(char c: word.toCharArray())
       {
           mask = mask ^ (1<<(c-'a'));
           result = result + count[mask];
           for(int i=0;i<10;i++)
           {
               result = result + count[mask^(1<<i)];
           }
           count[mask]++;
       }
       
       return result;
    }
}