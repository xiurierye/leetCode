package my.leetcode.twoSum;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution solution = new Solution();

    }

    static class Solution2 {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m = nums1.length;
            int n = nums2.length;
            int[] finalNums1 = m >= n ? nums2 : nums1;
            int[] finalNums2 = m >= n ? nums1 : nums2;
            m = finalNums1.length;
            n = finalNums2.length;


            int iMin = 0;
            int iMax = m;
            for (int i = (m+1) / 2; i >= 0 && i <= m; i = (iMin + iMax + 1 ) / 2) {
                int j = (m + n + 1) / 2 - i;
                int maxLeftA = i == 0 ? Integer.MIN_VALUE : finalNums1[i - 1];
                int maxLeftB = j == 0 ? Integer.MIN_VALUE : finalNums2[j - 1];
                int minRightA = i == m ? Integer.MAX_VALUE : finalNums1[i];
                int minRightB = j == n ? Integer.MAX_VALUE : finalNums2[j];

                if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                    return (m + n) % 2 == 0 ? (Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2d :
                            Math.max(maxLeftA, maxLeftB);
                }

                if (maxLeftA > minRightB) {
                    iMax = i - 1;
                } else//if (maxLeftB >minRightA)
                {
                    iMin = i;
                }

            }
            throw new IllegalArgumentException("error");
        }

    }

    static class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int length1 = nums1.length;
            int length2 = nums2.length;


            int length = length1 + length2;
            boolean even = length % 2 == 0;
            if (length1 == 0) {
                return this.compare(nums2, new int[0], even);
            }
            if (length2 == 0) {
                return this.compare(nums1, new int[0], even);
            }

            int first1 = nums1[0];
            int first2 = nums2[0];
            int last1 = nums1[nums1.length - 1];
            int last2 = nums2[nums2.length - 1];

            int[] first;
            int[] second;

            if (last2 <= first1) {
                first = nums2;
                second = nums1;
                return compare(first, second, even);
            } else if (last1 <= first2) {
                first = nums1;
                second = nums2;
                return compare(first, second, even);
            }
            return compare(nums1, nums2, even);
        }

        public double compare(int[] nums1, int[] nums2, boolean even) {
            int lowerIndex = (nums1.length + nums2.length) / 2;
            int i1 = 0, i2 = 0;
            int v1;
            int v2;
            int lower = 0;
            int upper = 0;
            for (int i = 0; i <= lowerIndex; i++) {
                lower = upper;
                if (i1 < nums1.length) {
                    v1 = nums1[i1];
                } else {
                    v1 = Integer.MAX_VALUE;
                }
                if (i2 < nums2.length) {
                    v2 = nums2[i2];
                } else {
                    v2 = Integer.MAX_VALUE;
                }

                if (v1 < v2) {
                    i1++;
                } else {
                    i2++;
                }

                upper = Math.min(v2, v1);
            }
            return even ? (upper + lower) / 2d : upper;
        }
    }
}

