class Solution {
    Map <Integer, Integer> hm = new HashMap<>(); 
    int dp(String s, int i) {
        int ans = 0;

        if(s.length() == i) return 1;
        if(hm.containsKey(i)) return hm.get(i);
        if(s.charAt(i) != '0') ans+=dp(s,i+1);
        
        if(i+1 < s.length() && (s.charAt(i) == '1' || (s.charAt(i) == '2' && s.charAt(i+1) <= '6'))) ans += dp(s,i+2);
        hm.put(i,ans); 
        return ans; 
    }
    public int numDecodings(String s) {
        return dp(s,0);
    }
}