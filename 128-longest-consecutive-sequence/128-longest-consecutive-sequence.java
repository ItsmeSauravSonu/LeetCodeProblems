class Solution {
    public int longestConsecutive(int[] a) {
        int len = a.length;
        if(len == 0 || len == 1) {
            return len;
        }
        
        int result = 0;
        
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i : a) {
            set.add(i);
        }
        
        for(int i = 0; i < len; i++) {
            
            int item = a[i];
            
            if(!set.contains(item)) continue;
            
            int prevItem = item-1;
            int nextItem = item+1;
            int prevCount = 0;
            int nextCount = 0;
            
            set.remove(item);
            
            while(set.contains(prevItem)) {
                set.remove(prevItem);
                prevCount++;
                prevItem--;
            }
            
            while(set.contains(nextItem)) {
                set.remove(nextItem);
                nextCount++;
                nextItem++;
            }
            
            result = Math.max(result, (prevCount+nextCount+1));
            
        }
        
        return result;

       
    }
}