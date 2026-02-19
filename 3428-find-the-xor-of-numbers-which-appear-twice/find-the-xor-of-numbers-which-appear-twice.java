class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Map <Integer, Integer> hm = new HashMap<>();
        for(int i: nums) {
            hm.put(i, hm.getOrDefault(i, 0) +1);
        }
        int ans = 0;
        for(Map.Entry <Integer, Integer> e : hm.entrySet()) {
            if(e.getValue() == 2) {
                ans ^= e.getKey();
            }
        }
        return ans;
    }
}