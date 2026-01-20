class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        for (int i = 1; i <= edges.length; i ++) createSet(i);
        for (int e[] : edges){
            int e1 = e[0];
            int e2 = e[1];

            Node n1 = find(map.get(e1));
            Node n2 = find(map.get(e2));

            if (n1 == n2) return e;
            else union(e1,e2);
        }

        return new int[0];
    }
    class Node{
        int pos;
        Node parent;
        int val; 
    }

    public void createSet(int v){
        Node n = new Node();
        n.pos=0;
        n.parent = n;
        n.val = v;
        map.put(v,n);
    }

    private HashMap<Integer,Node>map = new HashMap<>();

    public Node find(Node n){
        if(n.parent==n) return n;

        Node root = find(n.parent);
        n.parent = root;
        return root;
    }

    public void union(int e1, int e2){
        Node n1 = map.get(e1);
        Node n2 = map.get(e2);

        Node r1 = find(n1);
        Node r2 = find(n2);

        if(r1.pos == r2.pos){
            r1.parent = r2;
            r2.pos++;
        }

        else if(r1.pos > r2.pos) r2.parent = r1;

        else r1.parent = r2;
    }
}