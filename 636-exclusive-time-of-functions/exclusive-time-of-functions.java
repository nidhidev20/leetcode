class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        Stack <Integer> id = new Stack<>();
        int res[] = new int[n];
        int prev_time = 0, new_time, func, fid, tims;
        String typ;
        for(String i: logs) {
            String[] parts = i.split(":");
            fid = Integer.parseInt(parts[0]);
            tims = Integer.parseInt(parts[2]);
            typ = parts[1];
            if(typ.equals("start")) {
                if(!id.isEmpty()) res[id.peek()] += tims - prev_time;
                id.push(fid);
                prev_time = tims;
            } else {
                res[id.pop()] += tims - prev_time + 1;
                prev_time = tims + 1;
            }

        }
        return res;
    }
}