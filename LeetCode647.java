import java.util.Arrays;
/*
647. Palindromic Substrings
Given a string s, return the number of palindromic substrings in it.
A string is a palindrome when it reads the same backward as forward.
A substring is a contiguous sequence of characters within the string.

Example 1:
Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".

Example 2:
Input: s = "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".

Constraints:
1 <= s.length <= 1000
s consists of lowercase English letters.
 */
public class LeetCode647 {
    public static void main(String[] args) {
        int res = countSubstrings("longtimenosee");
        System.out.println(res);
    }
    public static int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];

        for(boolean[] i : dp) {
            Arrays.fill(i, true);
        }

        int res = s.length();

        for(int i = 1; i < s.length(); i++) {
            for(int j = 0; j < s.length()-i; j++) {
                if(s.charAt(j) != s.charAt(j+i)){
                    dp[j][j+i] = false;
                }
                else if(dp[j+1][j+i-1]){
                    res++;
                }else{
                    dp[j][j+i] = false;
                }
            }
        }

        return res;
    }
}
