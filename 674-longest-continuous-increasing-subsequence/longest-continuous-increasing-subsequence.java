class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int cnt = 1, max = 1;
        for(int j = 1; j < nums.length; j++) {
            if(nums[j - 1] < nums[j]) { 
                cnt++;
                max = Math.max(max, cnt);
            }
            else cnt = 1;
        }
        return max;
    }
}