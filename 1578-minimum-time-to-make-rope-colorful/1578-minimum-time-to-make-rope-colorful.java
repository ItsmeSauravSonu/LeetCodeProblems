class Solution {
    public int minCost(String colors, int[] neededTime) {
         int ans = 0;
        
        int i = 0;
        int n = colors.length();
        Stack<Integer> stk = new Stack<>();
        while(i<n){
            if(!stk.isEmpty() && colors.charAt(i) == colors.charAt(stk.peek())){
                if(neededTime[i] <= neededTime[stk.peek()]){
                    ans += neededTime[i];
                }else{
                    ans += neededTime[stk.pop()];
                    stk.push(i);
                }
            }else{
                stk.push(i);
            }
            i++;
        }
        
        return ans;
    }
}