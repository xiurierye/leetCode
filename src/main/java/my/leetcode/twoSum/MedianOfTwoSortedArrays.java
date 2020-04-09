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


        public double median(int[] num1, int[] num2, int leftTail1, int rightHead1, int leftTail2, int rightHead2, boolean even) {
            int maxLeftPart1 = Integer.MIN_VALUE;
            int maxLeftPart2 = Integer.MIN_VALUE;
            int minRightPart1 = Integer.MAX_VALUE;
            int minRightPart2 = Integer.MAX_VALUE;

            if (0 <= leftTail1 && leftTail1 < num1.length) {
                maxLeftPart1 = num1[leftTail1];
            }

            if (0 <= leftTail2 && leftTail2 < num2.length) {
                maxLeftPart2 = num2[leftTail2];
            }

            if (0 <= rightHead1 && rightHead1 < num1.length) {
                minRightPart1 = num1[rightHead1];
            }
            if (0 <= rightHead2 && rightHead2 < num2.length) {
                minRightPart2 = num2[rightHead2];
            }

            int maxLeft = Math.max(maxLeftPart1, maxLeftPart2);
            int minRight = Math.min(minRightPart1, minRightPart2);
            if (maxLeft <= minRight) {
                if (even) {
                    return (maxLeft + minRight) / 2d;
                } else {
                    return maxLeft;
                }
            }

            if (maxLeftPart1 > minRightPart2) {
                if (leftTail1 == 0) {
                    return median(num1, num2, -1, 0, leftTail2, rightHead2, even);
                }
                int leftPart1Length = leftTail1 + 1;
                int nextLeftTail1 = leftPart1Length / 2 - (leftPart1Length % 2 == 0 ? 1 : 0);
                int nextRightHead1 = nextLeftTail1 + 1;
                return median(num1, num2, nextLeftTail1, nextRightHead1, leftTail2, rightHead2, even);
            } else {
                if (leftTail2 == 0) {
                    return median(num1, num2, leftTail1, rightHead1, -1, 0, even);
                }
                int leftPart2Length = leftTail2 + 1;
                int nextLeftTail2 = leftPart2Length / 2 - (leftPart2Length % 2 == 0 ? 1 : 0);
                int nextRightHead2 = nextLeftTail2 + 1;
                return median(num1, num2, leftTail1, rightHead1, nextLeftTail2, nextRightHead2, even);
            }
        }

        public double median(int[] nums) {
            int length = nums.length;
            boolean even = length % 2 == 0;
            if (even) {
                return (nums[(length / 2) - 1] + nums[length / 2]) / 2d;
            } else {
                return nums[length / 2];
            }
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

