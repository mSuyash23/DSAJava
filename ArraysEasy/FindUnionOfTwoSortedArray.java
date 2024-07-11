/*
QUESTION:-
Union of two arrays can be defined as the common and distinct elements in the two arrays.
Given two sorted arrays of size n and m respectively, find their union.


Example 1:

Input:
n = 5, arr1[] = {1, 2, 3, 4, 5}
m = 3, arr2 [] = {1, 2, 3}
Output: 1 2 3 4 5
Explanation: Distinct elements including
both the arrays are: 1 2 3 4 5.


Example 2:

Input:
n = 5, arr1[] = {2, 2, 3, 4, 5}
m = 5, arr2[] = {1, 1, 2, 3, 4}
Output: 1 2 3 4 5
Explanation: Distinct elements including
both the arrays are: 1 2 3 4 5.
*/

import java.util.*;

public class FindUnionOfTwoSortedArray {

    public static void main(String[] args) {
        int[] arr_one = new int[] { 2, 2, 3, 4, 5 };
        int[] arr_two = new int[] { 1, 1, 2, 3, 4 };

        FindUnionOfTwoSortedArray solution = new FindUnionOfTwoSortedArray();
        ArrayList<Integer> union = solution.findUnion(arr_one, arr_two);
        System.out.println("Union of the arrays: " + union);
    }

    public ArrayList<Integer> findUnion(int[] arr_one, int[] arr_two) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr_one.length && j < arr_two.length) {
            if (i > 0 && arr_one[i] == arr_one[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && arr_two[j] == arr_two[j - 1]) {
                j++;
                continue;
            }

            if (arr_one[i] < arr_two[j]) {
                result.add(arr_one[i++]);
            } else if (arr_one[i] > arr_two[j]) {
                result.add(arr_two[j++]);
            } else {
                result.add(arr_one[i]);
                i++;
                j++;
            }
        }

        while (i < arr_one.length) {
            if (i == 0 || arr_one[i] != arr_one[i - 1]) {
                result.add(arr_one[i]);
            }
            i++;
        }

        while (j < arr_two.length) {
            if (j == 0 || arr_two[j] != arr_two[j - 1]) {
                result.add(arr_two[j]);
            }
            j++;
        }

        return result;
    }
}
