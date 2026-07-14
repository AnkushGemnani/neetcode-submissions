class Solution {
    public int lengthOfLongestSubstring(String s) {

        // Stores all unique characters in the current sliding window
        HashSet<Character> set = new HashSet<>();

        // Left pointer of the sliding window
        int left = 0;

        // Stores the maximum length found so far
        int maxLength = 0;

        // Right pointer expands the window
        for (int right = 0; right < s.length(); right++) {

            // Current character
            char ch = s.charAt(right);

            // If duplicate exists, shrink the window
            // until the duplicate is removed
            while (set.contains(ch)) {

                // Remove the leftmost character
                set.remove(s.charAt(left));

                // Move left pointer forward
                left++;
            }

            // Add current character to the window
            set.add(ch);

            // Current window length = right - left + 1
            maxLength = Math.max(maxLength, right - left + 1);
        }

        // Return the longest substring length
        return maxLength;
    }
}