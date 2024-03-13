/*
5. The longest Palindromic Substring
Given a string s, return the longest palindromic substring in s.

Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Example 2:
Input: s = "cbbd"
Output: "bb"

Constraints:
1 <= s.length <= 1000
s consist of only digits and English letters.
 */

public class LeetCode5 {
    public static void main(String[] args) {

    }

    public static String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        String ans = "";

        for(int i = 0; i < s.length(); i++){
            for(int j = 0, k = i; k < s.length(); j++, k++){
                if(i == 0){
                    dp[j][k] = true;
                }
                else {
                    boolean b = s.charAt(j) == s.charAt(k);
                    if(i == 1){
                        if(b){
                            dp[j][k] = true;
                        }
                    }
                    else{
                        if(b && dp[j+1][k-1]){
                            dp[j][k] = true;
                        }
                    }
                }

                if(dp[j][k]) {
                    ans = s.substring(j, k+1);
                }
            }
        }

        return ans;
    }
}
