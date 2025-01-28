class Solution {
    public boolean isPalindrome(int x) {
        int reversed = 0;
        int duplicate = x;
        while( x > 0){
            int last_digit = x%10;
            reversed = (reversed*10)+ last_digit;
            x = x/10;
        }

        if( duplicate == reversed){
            return true ;
        }
        else {
            return false ;
        }
    }
}
