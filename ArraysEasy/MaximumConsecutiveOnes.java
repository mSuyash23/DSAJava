/*Given a binary array nums, return the maximum number of consecutive 1's in the array.*/

/*
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

Input: nums = [1,0,1,1,0,1]
Output: 2 */

public class MaximumConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 1, 0, 1, 1, 1 };
        findMaxConsecutiveOnes(nums);

    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 0;
            }
        }
        ans = Math.max(ans, count);
        return ans;
    }
}
