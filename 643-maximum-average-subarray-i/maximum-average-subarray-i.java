class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max = Integer.MIN_VALUE, sum = 0, n = nums.length;
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        } 
        max = sum;
        for(int i = k; i < n; i++) {
            int ne = nums[i];
            int oe = nums[i-k];
            sum = sum + ne - oe;
            max = Math.max(sum,max);
        }
        return (double) max / k;
    }
}