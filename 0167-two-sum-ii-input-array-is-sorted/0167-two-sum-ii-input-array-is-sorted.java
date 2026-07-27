class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // Brute Force approach - O(n^2)
        //
        // for(int i = 0 ; i < numbers.length ; i++) {
        //     for(int j = i+1 ; j < numbers.length ; j++) {
        //         if(numbers[i]+numbers[j] == target) {
        //             return new int[]{i+1,j+1};
        //         }
        //     }
        // }
        // return new int[]{};

        // Optimal Approach - Two Pointers

        int left = 0;
        int right = numbers.length - 1;

        for (int i = 0; i < numbers.length; i++) {
            
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }
}