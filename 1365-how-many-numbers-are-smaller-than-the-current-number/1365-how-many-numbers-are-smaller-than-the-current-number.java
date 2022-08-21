class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
           
           PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
           for(int i: nums){
               pq.add(i);
           }
         Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            hm.put(pq.peek(),pq.size()-1);
            pq.remove();
        }
        int[] result=new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            result[i]=hm.get(nums[i]);
        }
        return result;
    }
}