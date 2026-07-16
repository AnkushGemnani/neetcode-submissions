class Solution {

    public int[] sortArray(int[] nums) {

        // Length of the array
        int n = nums.length;
        //BUBBLE SORT(NORMAL SORTING)
        // Outer loop = Number of passes
        // After every pass, one largest element reaches its correct position
        for (int i = 0; i < n - 1; i++) {

            // Inner loop compares adjacent elements
            // "- i" because the last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {

                // If left element is greater than right element
                // swap them
                if (nums[j] > nums[j + 1]) {

                    // Store first element temporarily
                    int temp = nums[j];

                    // Move smaller element to the left
                    nums[j] = nums[j + 1];

                    // Put larger element on the right
                    nums[j + 1] = temp;
                }
            }
        }

        // Return the sorted array
        return nums;
    }
}