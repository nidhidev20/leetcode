class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int i = 1, ans[] = new int[2];
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() == 2) ans[0] = entry.getKey(); 
        }
        while(i <= nums.length) {
            if(!map.containsKey(i)) ans[1] = i; 
            i++;
        } return ans;
    }
}
