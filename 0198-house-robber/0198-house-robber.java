class Solution {
    public int rob(int[] nums) {
        int a = 0;
        int b = 0;
        for(int n : nums){
            int temp = Math.max(a + n, b);
            a = b;
            b = temp;
        }
        return b;
    }
}