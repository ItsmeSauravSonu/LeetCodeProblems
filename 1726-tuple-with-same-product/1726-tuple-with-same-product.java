class Solution {
    public int tupleSameProduct(int[] nums) {
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
              int prod = nums[i] * nums[j];
            int c = map.getOrDefault(prod, 0);
            ans+=c; //Number of valid pair of pairs.
            map.put(prod,  c+ 1); 
            }
        }
        return ans*8; 
    }
}