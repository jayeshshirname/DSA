class Solution {

    // 9. Palindrome Number
    public boolean isPalindrome(int x) {
        int original_number = x;
        int reversed = 0;

        if(x < 0){
            return false;
        }
       
        while(x != 0){
            int digit = x%10;
            reversed = reversed * 10 + digit;
            x = x/10;
        }
        return original_number == reversed;
    }
}