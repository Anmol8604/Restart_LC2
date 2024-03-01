/*
Maximum Index
Given an array a of n positive integers. The task is to find the maximum of j - i subjected to the constraint of a[i] < a[j] and i < j.

Example 1:
Input:
n = 2
a[] = {1, 10}
Output:
1
Explanation:
a[0] < a[1] so (j-i) is 1-0 = 1.

Example 2:
Input:
n = 9
a[] = {34, 8, 10, 3, 2, 80, 30, 33, 1}
Output:
6
Explanation:
In the given array a[1] < a[7] satisfying the required condition(a[i] < a[j]) thus giving the maximum difference of j - i which is 6(7-1).

Your Task:
The task is to complete the function maxIndexDiff() which finds and returns maximum index difference. Printing the output will be handled by driver code.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
 */
public class Gfg_Maximum_Index {
    public static void main(String[] args) {

    }

    // Auxiliary Space: O(N) approach
    static int maxIndexDiff_Optimize(int a[], int n) {
        int[] smaller = new int[n];
        int[] larger = new int[n];
        smaller[0] = a[0];
        larger[n-1] = a[n-1];
        for(int i = 1; i < n; i++) {
            smaller[i] = Math.min(a[i], smaller[i-1]);
        }
        for(int i = n-2; i >= 0; i--) {
            larger[i] = Math.max(larger[i+1], a[i]);
        }

        int i = 0, j = 0, ans = 0;

        while(i<n && j<n){
            if(smaller[i] <= larger[j]){
                ans = Math.max(ans, j-i);
                j++;
            }
            else {
                i++;
            }
        }
        return ans;
    }

        // My Approach
    static int maxIndexDiff(int[] a, int n) {
        if(n < 2){
            return 0;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                if(a[j] <= a[n-1-i+j]){
                    return n-i-1;
                }
            }
        }
        return 0;
    }
}
