class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int right = 0;
        int max = 0;

        Set<Character> set = new HashSet<>();

        while (right < s.length()) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            max = Math.max(max, set.size());
            right++;
        }
        
        // for (int i = 0; i < s.length(); i++) {
        //     Set<Character> set = new HashSet<>();

        //     for (int j = i; j < s.length(); j++) {
        //         if (set.contains(s.charAt(j))) {
        //             break;
        //         }
        //         set.add(s.charAt(j));
        //         max = Math.max(max, set.size());
        //     }
        // }

        return max;
    }
}