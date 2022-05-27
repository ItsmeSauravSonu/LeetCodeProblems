class Solution {
    public int percentageLetter(String s, char letter) {
        int length = s.length();
        int count = 0;
        for(char c: s.toCharArray())
        {
            if(c==letter)
            {
                count++;
            }
        }
        if(count==0) return 0;
        int per = (count*100)/length;
        return per;
    }
}