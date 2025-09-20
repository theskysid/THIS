package Leetcode.Stack;

import java.util.Stack;

public class M_reversesubstringbetweeneachpairofparenthesis_1190 {
   public static String reverseParentheses(String s) {
      Stack<Character> stack = new Stack<>();
      StringBuilder sb = new StringBuilder("");
      int n = s.length();
      for(int i = 0; i< n; i++){
         char c = s.charAt(i);
         if(c != ')'){
            stack.push(c);
         } else {
            while (stack.peek() != '(') {
               sb.append(stack.pop());
            }
            int j = 0;
            int sblength = sb.length();
            stack.pop();
            while (sblength > 0) {
               stack.push(sb.charAt(j));
               j++;
               sblength--;
            }
            sb = new StringBuilder("");
         }
      }
      while(!stack.isEmpty()){
         sb.append(stack.pop());
      }
      return sb.reverse().toString();
   }

   public static void main(String[] args) {
      String s = "(ed(et(oc))el)";
      System.out.println(reverseParentheses(s));
   }
}
