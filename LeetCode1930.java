import java.util.HashMap;
import java.util.HashSet;

/*
1930. Unique Length-3 Palindromic Subsequences

Given a string s, return the number of unique palindromes of length three that are a subsequence of s.
Note that even if there are multiple ways to obtain the same subsequence, it is still only counted once.
A palindrome is a string that reads the same forwards and backwards.
A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
For example, "ace" is a subsequence of "abcde".

Example 1:
Input: s = "aabca"
Output: 3
Explanation: The 3 palindromic subsequences of length 3 are:
- "aba" (subsequence of "aabca")
- "aaa" (subsequence of "aabca")
- "aca" (subsequence of "aabca")

Example 2:
Input: s = "adc"
Output: 0
Explanation: There are no palindromic subsequences of length 3 in "adc".

Example 3:
Input: s = "bbcbaba"
Output: 4
Explanation: The 4 palindromic subsequences of length 3 are:
- "bbb" (subsequence of "bbcbaba")
- "bcb" (subsequence of "bbcbaba")
- "bab" (subsequence of "bbcbaba")
- "aba" (subsequence of "bbcbaba")
 */
public class LeetCode1930 {
    public static void main(String[] args) {
        int a = countPalindromicSubsequence("ckafnafqo");
        System.out.println(a);
    }
    public static  int countPalindromicSubsequence(String s) {
        if(s.length() < 3){
            return 0;
        }
        HashSet<Character> left = new HashSet<>();
        HashMap<Character, Integer> right =  new HashMap();
        for(char a : s.toCharArray()){
            right.put(a, right.getOrDefault(a, 0)+1);
        }
        left.add(s.charAt(0));
        if(right.get(s.charAt(0)) == 1){
            right.remove(s.charAt(0));
        }
        else{
            right.put(s.charAt(0), right.get(s.charAt(0))-1);
        }
        HashSet<String> res = new HashSet<>();
        for(int i = 1; i < s.length()-1; i++) {
            if(right.get(s.charAt(i)) == 1){
                right.remove(s.charAt(i));
            }
            else{
                right.put(s.charAt(i), right.get(s.charAt(i))-1);
            }
            for(char a : left){
                if(right.containsKey(a)) {
                    String ans = (a+"") + (s.charAt(i)+"") + (a+"");
                    res.add(ans);
                }
            }
            left.add(s.charAt(i));
        }

        return res.size();
    }


}