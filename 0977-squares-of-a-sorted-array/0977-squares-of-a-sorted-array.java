class Solution {
    public int[] sortedSquares(int[] nums) {

     // 1. Square each element using a standard index loop
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        
        // 2. Sort the array in place
        Arrays.sort(nums);
        
        // 3. Return the sorted array
        return nums;
    }
}