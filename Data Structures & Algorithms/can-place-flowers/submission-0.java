class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length; i++) {

            if (flowerbed[i] == 0) {

                // Check left
                boolean leftEmpty = (i == 0 || flowerbed[i - 1] == 0);

                // Check right
                boolean rightEmpty = (i == flowerbed.length - 1 ||
                                      flowerbed[i + 1] == 0);

                if (leftEmpty && rightEmpty) {

                    // Plant flower
                    flowerbed[i] = 1;

                    n--;

                    // Enough flowers planted
                    if (n == 0) {
                        return true;
                    }
                }
            }
        }

        return n <= 0;
    }
}