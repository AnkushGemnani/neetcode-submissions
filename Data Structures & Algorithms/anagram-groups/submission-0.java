class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
            for (String word : strs) {

            // Convert word to character array
            char[] arr = word.toCharArray();

            // Sort the characters
            Arrays.sort(arr);

            // Convert back to String
            String sorted = new String(arr);

            // If key already exists, add to existing list
            if (map.containsKey(sorted)) {
                map.get(sorted).add(word);
            }

            // Otherwise create a new list
            else {

                List<String> list = new ArrayList<>();

                list.add(word);

                map.put(sorted, list);
            }
        }

        // Return all grouped anagrams
        return new ArrayList<>(map.values());
    }
}
