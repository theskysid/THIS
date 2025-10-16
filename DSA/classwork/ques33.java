package Attempting;

public class ques33 {
   public static String alternateReverse(String s, int k) {
      StringBuilder result = new StringBuilder();
      boolean leave = true;
      for (int i = 0; i < s.length(); i += k) {
         int end = Math.min(i + k, s.length());
         String part = s.substring(i, end);
         if (leave) {
            result.append(part);
         } else {
            result.append(new StringBuilder(part).reverse());
         }
         leave = !leave;
      }
      return result.toString();
   }

   public static void main(String[] args) {
      String s = "abcdefghijkl";
      System.out.println(alternateReverse(s, 3));
   }
}
