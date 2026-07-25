class Solution {

    // 3536. Maximum Product of Two Digits
    public int maxProduct(int n) {

        int maximum1 = 0;
        int maximum2 = 0;

        while (n != 0) {
            int digit = n % 10;

            if (digit >= maximum1) {
                maximum2 = maximum1;
                maximum1 = digit;
            } else if (digit > maximum2) {
                maximum2 = digit;
            }

            n /= 10;
        }

        return maximum1 * maximum2;
    }
}