class Solution {
    public static int maxProduct(int[] arr) {

        int n = arr.length;
        int leftProduct = 1;
        int rightProduct = 1;

        int ans = Integer.MIN_VALUE;

        int left = 0;
        int right = n - 1;

        while (left < n && right >= 0) {

            if (leftProduct == 0)
                leftProduct = 1;

            if (rightProduct == 0)
                rightProduct = 1;

            leftProduct *= arr[left];
            rightProduct *= arr[right];

            ans = Math.max(ans, Math.max(leftProduct, rightProduct));

            left++;
            right--;
        }

        return ans;
    }
}