class Solution {
    public int[] countBits(int n) {
        int cnt[] = new int[n+1];

        for(int i = 0; i < n+1; i++) {
            int hehe = 0, j = i;
            while(j > 0) {
                j &= j - 1;
                hehe++;
            }
            cnt[i] = hehe;
        }
        return cnt;
    }
}