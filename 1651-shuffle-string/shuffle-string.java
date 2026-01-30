class Solution {
    public String restoreString(String s, int[] indices) {
        char sb[] = new char[indices.length];
        for(int i = 0; i < indices.length; i++) sb[indices[i]] = s.charAt(i);
        return new String(sb);
    }
}