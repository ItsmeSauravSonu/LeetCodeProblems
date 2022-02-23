class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
       List<Integer>ans=new ArrayList();
	 int[] prefix=new int[security.length];
	 int[] suffix=new int[security.length];
	 suffix[suffix.length-1]=1;
	 prefix[0]=1;
	 
	 for(int i = 1; i < prefix.length; i++) {
         
		 if (security[i] <= security[i-1]) prefix[i] = prefix[i-1]+1;
		 else prefix[i] = 1;
         
	 }
	 
	 for(int i = suffix.length-2; i >= 0; i--) {
         
		 if (security[i] <= security[i+1]) suffix[i] =suffix[i+1]+1;
		 else suffix[i] = 1;
         
	 }
	 
	 for(int i = 0; i < security.length; i++) {
         
		 int temp = Math.min(prefix[i], suffix[i]);
		 if(temp > time)  ans.add(i);	
         
	 } 
	 return ans;     
}
}
