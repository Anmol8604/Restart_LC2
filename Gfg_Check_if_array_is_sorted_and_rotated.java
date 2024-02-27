/*
Check if array is sorted and rotated
Given an array arr[] of N distinct integers, check if this array is Sorted (non-increasing or non-decreasing) and Rotated counter-clockwise. Note that input array may be sorted in either increasing or decreasing order, then rotated.
A sorted array is not considered as sorted and rotated, i.e., there should be at least one rotation.

Example 1:
Input:
N = 4
arr[] = {3,4,1,2}
Output: Yes
Explanation: The array is sorted
(1, 2, 3, 4) and rotated twice
(3, 4, 1, 2).

Example 2:
Input:
N = 3
arr[] = {1,2,3}
Output: No
Explanation: The array is sorted
(1, 2, 3) is not rotated.

Your Task:
The task is to complete the function checkRotatedAndSorted() which returns true if an array is sorted and rotated clockwise otherwise false.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
 */
public class Gfg_Check_if_array_is_sorted_and_rotated {
    public static void main(String[] args) {

    }

    public static boolean checkRotatedAndSorted(int[] arr, int num){

        // Your code here
        if(num==1) return false;
        if(arr[0] < arr[num-1]) return false;

        int temp = 0;

        for(int i = 1; i < num; i++) {
            if(temp > 1){
                return false;
            }
            if(arr[i] < arr[i-1]){
                temp++;
            }
        }
        return temp==1;
    }
}
