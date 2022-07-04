class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char res = letters[0];
        
        int start = 0, end = letters.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(letters[mid]<=target)
            {
                start=mid+1;
            }else{
                res = letters[mid];
                end = mid - 1;
            }
        }
        return res;
    }
}