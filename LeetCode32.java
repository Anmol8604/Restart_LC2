import java.util.Stack;
/*
32. Longest Valid Parentheses
Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses
substring

Example 1:
Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".

Example 2:
Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".

Example 3:
Input: s = ""
Output: 0
 */
public class LeetCode32 {
    public static void main(String[] args) {
//       System.out.println(longestValidParentheses("(()"));
    }

    // TLE
    /*
    public static int longestValidParentheses(String s) {
        int res = 0;

        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j <= i; j++) {
                String a = s.substring(j, s.length()-i+j);
                if(isValid(a)){
                    return a.length();
                }
            }
        }
        return res;
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char a : s.toCharArray()) {
            if(a == '('){
                stack.push(a);
            }
            else if(!stack.isEmpty()) {
                stack.pop();
            }
            else{
                return false;
            }
        }

        return stack.isEmpty();
    }

     */
}
