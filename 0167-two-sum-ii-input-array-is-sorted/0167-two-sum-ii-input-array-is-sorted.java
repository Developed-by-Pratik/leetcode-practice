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

        // Better Approach 

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            int complement = target - numbers[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement) + 1, i + 1};
            }

            map.put(numbers[i], i);
        }

        return new int[]{};

        // Optimal Approach - Two Pointers

        // int left = 0;
        // int right = numbers.length - 1;

        // while (left < right) {

        //     int sum = numbers[left] + numbers[right];

        //     if (sum == target) {
        //         return new int[] { left + 1, right + 1 };
        //     } else if (sum < target) {
        //         left++;
        //     } else {
        //         right--;
        //     }
        // }
        // return new int[] {};
    }
}