class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int minR = 0, minC = 0, maxR = n - 1, maxC = n - 1;
        int count = 0, sq = n * n, k = 1;
        while (count < sq) {
            for (int i = minC; i <= maxC; i++) {
                ans[minR][i] = k++;
                count++;
            }
            minR++;
            if (count >= sq)
                break;
            for (int i = minR; i <= maxR; i++) {
                ans[i][maxC] = k++;
                count++;
            }
            maxC--;
            if (count >= sq)
                break;
            for (int i = maxC; i >= minC; i--) {
                ans[maxR][i] = k++;
                count++;
            }
            maxR--;
            if (count >= sq)
                break;
            for (int i = maxR; i >= minR; i--) {
                ans[i][minC] = k++;
                count++;
            }
            minC++;
        }
        return ans;
    }
}