class Solution {
    public int minimumCost(int[] nums) {
        int x = 51, y = 51;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < x) {
                y = x;
                x = nums[i];
            } else if(nums[i] < y) y = nums[i];
            if(x == 1  && y == 1) break;
        }
        return nums[0] + x + y;
    }
}