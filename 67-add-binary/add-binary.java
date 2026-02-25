class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int x = a.length() - 1, y = b.length() - 1, carry = 0;
        while(x >=0 || y >= 0 || carry > 0) {
            int c = x>=0? a.charAt(x) - '0': 0;
            int d = y >= 0? b.charAt(y) - '0': 0;

            int total = c + d + carry;
            sb.append(total % 2);
            carry = total / 2;
            x--; y--;
        }
        return sb.reverse().toString();
    }
}