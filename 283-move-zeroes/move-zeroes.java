class Solution {
    public void moveZeroes(int[] nums) {
        int n1 = 0;
        for(int n2 = 0; n2 < nums.length; n2++) {
            if(nums[n2]!=0) {
                int temp = nums[n2]; 
                nums[n2] = nums[n1];
                nums[n1] = temp;
                n1++;
            }
        }
    }
}