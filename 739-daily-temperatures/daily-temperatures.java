class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        java.util.Stack<Integer> st = new java.util.Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                int idx = st.pop();
                ans[idx] = i - idx;
            }
            st.push(i);
        }

        return ans;
    }
}
