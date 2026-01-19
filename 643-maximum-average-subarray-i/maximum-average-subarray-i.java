class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max = Integer.MIN_VALUE, sum = 0, n = nums.length;
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }
        max = sum;
        for(int i = k; i < n; i++) {
            sum = sum + nums[i] - nums[i-k];
            max = Math.max(sum,max);
        }
        return (double) max / k;
    }
}