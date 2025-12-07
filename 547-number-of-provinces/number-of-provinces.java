class Solution {
    public int findCircleNum(int[][] isConnected) {
        Set<Integer> vis = new HashSet<>();
        int p = 0;

        for(int i = 0; i <isConnected.length; i++) {
            if(!vis.contains(i)) {
                dfs(i, isConnected, vis);
                p++;
            }
        }
        return p;
    }

    private void dfs(int city, int[][] isConnected, Set<Integer> vis) {
        vis.add(city);
        for(int i = 0; i < isConnected[city].length; i++) {
            int c = isConnected[city][i];
            if(c==1 && !vis.contains(i)) dfs(i, isConnected, vis);
        }
    }
}