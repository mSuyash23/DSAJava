/*
QUESTION:-
You are given an array 'A' of size 'N' and an integer 'K'. You need to print the length of the longest subarray of array 'A' whose sum = 'K'.
Example:
Input: 'N' = 7 'K' = 3
'A' = [1, 2, 3, 1, 1, 1, 1]
Output: 3
Explanation: Subarrays whose sum = '3' are:
[1, 2], [3], [1, 1, 1], [1, 1, 1]
Here, the length of the longest subarray is 3, which is our final answer.
*/

public class LongestSubarrayWithGivenSum {

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 1, 1, 1, 1 };
        int k = 3;
        System.out.println(longestSubarrayWithSumK(nums, k));

    }

    public static int longestSubarrayWithSumK(int[] nums, int k) {
        int ans = 0;
        int sum = 0;
        int i = 0, j = 0;
        while (j < nums.length) {

            sum += nums[j];
            if (sum == k) {
                ans = Math.max(ans, j - i + 1);

            } else if (sum > k) {
                while (sum > k && i < j) {
                    sum -= nums[i];
                    i++;
                }
            }
            j++;

        }
        return ans;
    }
}
