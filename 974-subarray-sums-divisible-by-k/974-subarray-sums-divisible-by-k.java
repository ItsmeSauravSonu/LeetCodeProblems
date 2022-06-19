class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       int sum = 0, result = 0;
       Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int rem = sum%k;
            if(rem<0) rem+=k;
            if(map.containsKey(rem)){
                result+=map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return result;
    }
}

