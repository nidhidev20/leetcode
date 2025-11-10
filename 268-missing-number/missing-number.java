class Solution {
    public int missingNumber(int[] nums) {
        int sum = (nums.length+1) * (nums.length) / 2;
        int numssum = 0;
        for(int num: nums) {
            numssum += num;
        }
        return sum-numssum;
    }
}