class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++) {
            // FIX 1: If adding fails (returns false), it means a duplicate exists.
            // Loop until the duplicate at s.charAt(right) is removed.
            while (!set.add(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // FIX 2: Replaced the infinite while loop with a direct assignment 
            // once the window is verified to be valid and unique.
            maxLength = Math.max(maxLength, (right - left + 1));
        }

        return maxLength;
    }
}