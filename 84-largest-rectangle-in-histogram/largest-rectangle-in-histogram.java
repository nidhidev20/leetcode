class Solution {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) return 0;

        Deque<Integer> miStack = new ArrayDeque<>(); 
        int result = 0;

        for (int i = 0; i < heights.length; i++) {
            if (miStack.isEmpty() || heights[i] > heights[miStack.peekLast()]) {
                miStack.offerLast(i);
            } else { 
                while (
                    !miStack.isEmpty() && 
                    heights[miStack.peekLast()] >= heights[i]
                ) {
                    int tail = miStack.pollLast();
                    if (heights[tail] == heights[i]) continue;

                    int leftBound = (miStack.isEmpty()) ? -1 : miStack.peekLast();
                    int rightBound = i;
                    int area = heights[tail] * (rightBound - leftBound - 1);
                    if (area > result) result = area;
                }

                miStack.offerLast(i);
            }
        }

        while (!miStack.isEmpty()) {
            int tail = miStack.pollLast();
            int leftBound = (miStack.isEmpty()) ? -1 : miStack.peekLast();
            int rightBound = heights.length;
            int area = heights[tail] * (rightBound - leftBound - 1);
            if (area > result) result = area;
        }

        return result;
    }
}