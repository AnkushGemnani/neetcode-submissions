class Solution {

    public int[] sortArray(int[] nums) {

        int n = nums.length;

        // Move boundary of sorted part
        for (int i = 0; i < n - 1; i++) {

            // Assume current element is the smallest
            int minIndex = i;

            // Search for the smallest element
            // in the remaining unsorted array
            for (int j = i + 1; j < n; j++) {

                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap only once
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }

        return nums;
    }
}