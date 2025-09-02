package Leetcode.Stack;

public class M_minimumremovetomakevalidparenthesis_1249 {
      public String minRemoveToMakeValid(String s) {
         StringBuilder sb = new StringBuilder();
         int open = 0;
         for (char c : s.toCharArray()) {
            if (c == '(') {
               open++;
               sb.append(c);
            } else if (c == ')') {
               if (open > 0) {
                  open--;
                  sb.append(c);
               }
            } else {
               sb.append(c);
            }
         }
         StringBuilder result = new StringBuilder();
         for (int i = sb.length() - 1; i >= 0; i--) {
            char c = sb.charAt(i);
            if (c == '(' && open > 0) {
               open--;
               continue;
            }
            result.append(c);
         }
         return result.reverse().toString();
      }
}
