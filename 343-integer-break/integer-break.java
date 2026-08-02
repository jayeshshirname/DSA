class Solution {
    public int integerBreak(int n) {
        if(n <= 3){
            return n - 1;
        }

        int q = n / 3;
        int r = n % 3;

        long ans;

        if(r == 0){
            ans = (long) Math.pow(3, q);
        }else if(r == 1){
            ans = (long) Math.pow(3, q - 1) * 4;
        }else {
            ans = (long) Math.pow(3, q) * 2;
        }
        return (int) ans;
    }
}