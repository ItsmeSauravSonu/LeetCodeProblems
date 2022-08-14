class Solution {
     static boolean solve(String s,String a){
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        for(char ch:s.toCharArray())
            arr1[ch-97]++;
        
        for(char ch:a.toCharArray()){
            arr2[ch-97]++;
        }
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i])
                return false;
        }
        
        return true;
        
    }
    public List<Integer> findAnagrams(String s, String p) {
        var ans=new ArrayList<Integer>();
        int n=p.length();
        for(int i=0;i<=s.length()-p.length();i++){
            if(solve(s.substring(i,i+n),p))
                ans.add(i);
            
        }
        
        return ans;
    }
}