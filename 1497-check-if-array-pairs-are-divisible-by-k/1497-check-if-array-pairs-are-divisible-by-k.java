class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] count = new int[k];
        for (int num : arr) {
            int r = ((num % k) + k) % k; // handle negatives
            count[r]++;
        }
        
        if (count[0] % 2 != 0) return false;
        
        for (int r = 1; r < k; r++) {
            if (count[r] != count[k - r]) return false;
        }
        
        return true;
    }
}
