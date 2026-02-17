class NumArray {
    int n, bits[];
    public NumArray(int[] nums) {
        n = nums.length;
        bits = new int[n + 1];
        for(int i = 0; i < n; i++) {
            bits[i+1] = bits[i] + nums[i];
        } 
    }
    
    
    public int sumRange(int left, int right) {
        return bits[right + 1] - bits[left];
    }
}
/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */