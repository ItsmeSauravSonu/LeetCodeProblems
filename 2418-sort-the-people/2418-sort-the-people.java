class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<names.length;i++){
            map.put(heights[i], names[i]);
        }
        List<String> ans = new ArrayList<>(map.values());
        System.out.println(ans);
        String [] res = new String[names.length];
        for(int i=0;i<res.length;i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}