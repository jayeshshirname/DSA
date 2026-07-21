class Solution {

    // 169. Majority Element
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        return nums[n/2];
    }
}