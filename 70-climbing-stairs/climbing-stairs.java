class Solution {
    // 70. Climbing Stairs
    public int climbStairs(int n) {
        if(n==0 || n==1){
            return 1;
        }

        int prev = 1, curr = 1;
        //use swap method.
        for(int i=2;i<=n;i++){
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
    }
}