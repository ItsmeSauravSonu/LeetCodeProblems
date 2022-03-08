class Solution {
    public boolean isPalindrome(int x) {
      if(x<0) 
      {
              return false;
      }
            
      double log = Math.log10(x);
      int total_digits = (int)(Math.floor(log))+1;
      int mask = (int)Math.pow(10,total_digits-1);
            
            for(int i=0;i<(total_digits/2);i++)
            {
                    int mostSignificantDigit = x/mask;
                    int onesPlaceDigit = x%10;
                    
                    if(mostSignificantDigit!=onesPlaceDigit)
                    {
                            return false;
                    }
                    x%=mask;
                    x/=10;
                    mask/=100;
            }
            return true;
    }
}