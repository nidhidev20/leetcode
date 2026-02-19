class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1, lm = 0, rm = 0, water = 0;
        while(l < r) {
            if(height[l] < height[r]) {
                if(lm < height[l]) lm = Math.max(lm, height[l]);
                else water += lm - height[l];
                l++;
            } 
            else {
                if(rm < height[r]) rm = Math.max(rm, height[r]);
                else water+= rm - height[r];
                r--;
            } 
            
        }
        return water;
    }
}