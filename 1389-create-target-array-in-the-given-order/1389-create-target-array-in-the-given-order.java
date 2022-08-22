class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<n;i++){
            list.add(index[i], nums[i]);
        }
        int [] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}