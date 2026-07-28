class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int uniqueCount = 1; // The first element is always unique
        
        for (int i = 1; i < nums.length; i++) {
            // Because the array is sorted, we only need to check the previous element
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }
        
        return uniqueCount;
    }
}