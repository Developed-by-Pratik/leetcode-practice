class Solution {
    public boolean containsDuplicate(int[] nums) {

        // Brute force approach 
        //
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] == nums[j]) {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        // Optimzed Approach 

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num))
                return true;
        }
        return false;

    }
}