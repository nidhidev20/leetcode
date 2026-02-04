class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> li = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            List <Integer> res = new ArrayList<>();
            res.add(1);
            int val = 1;
            for(int k = 1; k <= i; k++) {
                val = val * (i - k + 1) / k;
                res.add(val);
            }
            li.add(res);
        }
        return li;
    }
}