class Solution {
    public int[] replaceElements(int[] arr) {
        int rMax = -1, temp;
        for(int i = arr.length - 1; i >= 0; i--) {
            temp = arr[i];
            arr[i] = rMax;
            rMax = Math.max(rMax, temp);
        }
        return arr;
    }
}