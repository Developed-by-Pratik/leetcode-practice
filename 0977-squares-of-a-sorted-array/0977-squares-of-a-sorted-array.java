class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] ans = new int[nums.length];

        int low = 0;
        int high = nums.length - 1;
        int end = nums.length - 1;

        while (low <= high) {

            int left = nums[low] * nums[low];
            int right = nums[high] * nums[high];

            if (left > right) {
                ans[end] = left;
                low++;
            } else {
                ans[end] = right;
                high--;
            }

            end--;
        }

        return ans;

    }
}