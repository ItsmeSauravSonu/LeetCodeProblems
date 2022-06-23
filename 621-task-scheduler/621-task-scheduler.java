class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c: tasks)
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        List<Integer> list = new ArrayList(map.values());
        Collections.sort(list, Collections.reverseOrder());
        int max_number = list.get(0);
        int i=0, counter =0;
        
        while(i<list.size() && list.get(i)==max_number)
        {
            counter+=1;
            i+=1;
        }
        int ret = (max_number-1) * (n+1) + counter;
        return Math.max(ret, tasks.length);
    }
}