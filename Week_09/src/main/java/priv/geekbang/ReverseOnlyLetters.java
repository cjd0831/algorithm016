package priv.geekbang;

import java.util.Stack;

/**
 * 仅仅反转字母
 */
public class ReverseOnlyLetters {

  public String reverseOnlyLetters(String S) {
    Stack<Character> letters = new Stack();
    for (char c : S.toCharArray()) {
      if (Character.isLetter(c)) {
        letters.push(c);
      }
    }

    StringBuilder ans = new StringBuilder();
    for (char c : S.toCharArray()) {
      if (Character.isLetter(c)) {
        ans.append(letters.pop());
      } else {
        ans.append(c);
      }
    }

    return ans.toString();
  }
}
