class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int x : nums) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            if (e.getValue() == nums.length/2) {
                return e.getKey();
            }
        }
        return -1;
    }
}