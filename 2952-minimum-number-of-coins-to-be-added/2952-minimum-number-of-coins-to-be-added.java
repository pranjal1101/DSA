class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);

        int reach = 0;
        int added = 0;
        int i = 0;

        while (reach < target) {
            if (i < coins.length && coins[i] <= reach + 1) {
                reach += coins[i];
                i++;
            } else {
                reach = 2 * reach + 1;
                added++;
            }
        }

        return added;
    }
}