class Solution {
    public int smallestRepunitDivByK(int k) {
        int n = 1, rem = 0;
        while (n <= k) {
            rem = (rem * 10 + 1) % k;
            if(rem == 0) return n;
            n++;
        }
        return -1;
    }
}