package W1APITTP.D1AAlCTP.ValidPalindrome;

import java.util.*;

/**
 * Easy 125. Valid Palindrome (LeetCode)
 * Jira: SCRUM-30 - Day 1 - Arrays vs ArrayList + converging two pointers
 * https://leetcode.com/problems/valid-palindrome/
 *
 * Write your solution inside isPalindrome(...). Run ValidPalindromeTest; when every example
 * passes, copy the method into LeetCode's "class Solution { ... }" and submit.
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        Character chl;
        Character chr;

        while(l<r){
          chl = isChar(s.charAt(l));
          chr = isChar(s.charAt(r));

          if(chl==null){
              l++;
              continue;
          }

          if(chr==null){
              r--;
              continue;
          }

          if(chl==chr){
              l++;
              r--;
              continue;
          }

          return false;
        }

        return true;
    }

    private Character isChar(char c){
        if(Character.isLetter(c)) {
            return Character.toLowerCase(c);
        }
        else if(Character.isDigit(c)){
            return Character.valueOf(c);
        }
        else{
            return null;
        }
    }
}
