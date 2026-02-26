class Solution {
    public int[] sortByBits(int[] arr) {
        
        Integer[] ans = new Integer[arr.length];
        for(int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
        }

        Arrays.sort(ans, (a,b) -> {
            int bitsa = Integer.bitCount(a);
            int bitsb = Integer.bitCount(b);

            if(bitsa == bitsb) return a - b;
            return bitsa - bitsb;
        });
        for(int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }
        return arr;
    }
}