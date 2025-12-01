class Solution {
    public boolean isValid(String s) {
        Stack <Character> p = new Stack<>();
        char c, top;
        for(int i = 0; i < s.length(); i ++) {
            c = s.charAt(i);
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') p.push(s.charAt(i));
            else {
                if(p.isEmpty()) return false;
                top = p.peek();
                if(top == '(' && c == ')') {
                    p.pop();
                }
                else if(top == '{' && c == '}') {
                    p.pop();
                }
                else if(top == '[' && c == ']') {
                        p.pop();
                } else return false;
            }
        }
        return p.isEmpty();
    }
}