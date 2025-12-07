class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        create(nums, 0, ans, subset);
        return ans;
    }

    private void create(int[] nums, int idx, List<List<Integer>> ans, List<Integer> subset) {

        if(idx == nums.length) {
            ans.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[idx]);
        create(nums, idx+1, ans, subset);

        subset.remove(subset.size() - 1);
        create(nums, idx+1, ans, subset);
    }
}