class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int writeIndex = m + n - 1;
        int nums1Index = m - 1;
        int nums2Index = n - 1;

        while (nums1Index >= 0 && nums2Index >= 0) {
            if (nums1[nums1Index] < nums2[nums2Index]) {
                nums1[writeIndex] = nums2[nums2Index];
                nums2Index--;
            } else {
                nums1[writeIndex] = nums1[nums1Index];
                nums1Index--;
            }
            writeIndex--;
        }

        while (nums2Index >= 0) {
            nums1[writeIndex] = nums2[nums2Index];
            nums2Index--;
            writeIndex--;
        }
    }
}