class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length, p = 0;
        boolean vis[] = new boolean[n];

        for(int i = 0; i < n; i++) {
            if(!vis[i]) {
                dfs(i, isConnected, vis);
                p++;
            }
        }
        return p;
    }

    private void dfs(int city, int[][] isConnected, boolean[] vis) {
        vis[city] = true;
        for(int i = 0; i < isConnected.length; i++) {
            if(isConnected[city][i]==1 && !vis[i]) dfs(i, isConnected, vis);
        }
    }
}