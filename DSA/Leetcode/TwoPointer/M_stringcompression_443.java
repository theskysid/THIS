package Leetcode.TwoPointer;

public class M_stringcompression_443 {
   public static int compress(char[] chars) {
      int count = 0;
      StringBuilder str = new StringBuilder();
      int i = 0;
      int j = 0;
      while(i<chars.length){
         char c = chars[i];
         while(c==chars[j] && j<chars.length){
            j++;
            count++;
            if(j==chars.length){
               break;
            }
         }
         str.append(c);
         if(count>1){
            String countstring = Integer.toString(count);
            str.append(countstring);
         }
         i=j;
         count = 0;
      }
      return str.toString().length();
   }

   public static void main(String[] args) {
      char[] c = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
      System.out.println(compress(c));;
   }
}
