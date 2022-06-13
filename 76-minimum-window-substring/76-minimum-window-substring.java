class Solution {
    /*
      2 pointer Sliding window
                +
      2 Hashmaps -> Acquired and Required

      At any point of time we will find : Minimum window substring starting from ith index (i.e. first pointer )
    */
    public String minWindow(String s, String t) {
        int l = s.length();
        int m = t.length();
        
        HashMap<Character,Integer> required = new HashMap<>();
        for(char c : t.toCharArray())
        {
            int ov = required.getOrDefault(c, 0);
            required.put(c, ov+1);
        }
        
        HashMap<Character,Integer> acquired = new HashMap<>();
        int min = Integer.MAX_VALUE;
        String ans="";
        int i = 0;
        int j=0;
        int found = 0;
        while(i<l)
        {
            while(j<l && found!=m)
            {
                char cc = s.charAt(j);
                if(required.containsKey(cc))  // one useful character we have found
                {
                    int ov = acquired.getOrDefault(cc, 0);
                    acquired.put(cc, ov+1);
                    if(acquired.get(cc) > required.get(cc)){}  // koi doosra character jyaada mill gaya
                    else found += 1;
                } 
                j++;
            }
            
            int window_size = j-i;
            //System.out.println("i = "+i+", j="+j+", "+acquired);
            if(found==m && window_size<min)
            {
                min = window_size;
                ans = s.substring(i,j);
            }
            
            if(required.containsKey(s.charAt(i))) // useful character we are going to loose
            {
                int ov = acquired.get(s.charAt(i));
                acquired.put(s.charAt(i), ov-1);
                if(ov-1 < required.get(s.charAt(i))) found -= 1;  // we lost one useful character
            }
            
            i++;
            
        }
        
      return ans;
    }
}