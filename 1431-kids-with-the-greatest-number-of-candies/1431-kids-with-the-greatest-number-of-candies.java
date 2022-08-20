class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        for(int i: candies){
            if(i>maxi){
                maxi = i;
            }
        }
        
        for(int y: candies){
            int check = y+extraCandies;
            if(check>=maxi){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}