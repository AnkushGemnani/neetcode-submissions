class Solution {

    public int[] sortArray(int[] nums) {

        int n = nums.length;

        // Start from second element
        // because first element is already considered sorted
        for (int i = 1; i < n; i++) {

            // Current element to insert
            int key = nums[i];

            // Compare with previous elements
            int j = i - 1;

            // Shift all greater elements one step to the right
            while (j >= 0 && nums[j] > key) {

                nums[j + 1] = nums[j];

                j--;
            }

            // Insert key into correct position
            nums[j + 1] = key;
        }

        return nums;
    }
}