class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i: candyType)
        {
            set.add(i);
        }
        int half = n/2;
        if(set.size()>=half) return half;
        return set.size();
    }
}