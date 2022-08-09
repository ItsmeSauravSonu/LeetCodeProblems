class Solution {
    public String sortString(String s) {
        int cnt[]=new int[26];
        for(int i=0;i<s.length();i++){
            cnt[s.charAt(i)-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        while(true){
            if(s.length()==sb.length())break;
            for(int i=0;i<26;i++){
                if(cnt[i]>0){
                    sb.append((char)(i+'a'));
                    cnt[i]--;
                }
            }
            for(int i=25;i>=0;i--){
                if(cnt[i]>0){
                    sb.append((char)(i+'a'));
                    cnt[i]--;
                }
            }
        }
        return sb.toString();
    }
}