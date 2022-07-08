class Solution {
    public int nextGreaterElement(int n) {
        char[] digits = Integer.toString(n).toCharArray();
        
        int i = getIndexOfFirstSmallerDigit(digits);
        
        if (i == -1) return -1;
        
        int j = getIndexOfFirstLargerDigit(digits, i);
        
        swap(digits, i, j);
        reverse(digits, i + 1, digits.length - 1);
        return Long.parseLong(new String(digits)) > Integer.MAX_VALUE ? -1 : Integer.parseInt(new String(digits));
    }
    
    private void swap(char[] digits, int i, int j) {
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }
    
    private void reverse(char[] digits, int from, int to) {
        while (from < to) {
            swap(digits, from, to);
            from++;
            to--;
        }
    }
    
    private int getIndexOfFirstLargerDigit(char[] digits, int i) {
        for (int j = digits.length - 1; j > i; j--) {
            if (digits[j] > digits[i]) return j;
        }
        
        return -1;
    }
    
    private int getIndexOfFirstSmallerDigit(char[] digits) {
        for (int i = digits.length - 2; i >= 0; i--) {
            if (digits[i] < digits[i + 1]) return i;
        }
        
        return -1;
    }
}
    
