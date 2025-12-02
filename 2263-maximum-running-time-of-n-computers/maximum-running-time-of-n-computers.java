class Solution {
    public long maxRunTime(int n, int[] batteries) {
        Arrays.sort(batteries);
        long total = 0;
        for (int b : batteries) total += b;

        for (int i = batteries.length - 1; i >= 0 && n > 0; i--) {
            long avg = total / n;
            if (batteries[i] <= avg) break;
            total -= batteries[i];
            n--;
        }
        if (n == 0) return 0;
        return total / n;
    }
}
