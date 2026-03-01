package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem3853 {
   public String mergeCharacters(String s, int k) {
      boolean flag = true;
      while(flag){
         flag = false;
         List<Character> list = new ArrayList<>();
         for(char c: s.toCharArray()) list.add(c);

         for(int i = 0; i<list.size() && !flag; i++){
            for(int j = i+1; j<=i+k && j<list.size();j++){
               if(list.get(i).equals(list.get(j))){
                  list.remove(j);
                  StringBuilder sb = new StringBuilder();
                  for(char c: list) sb.append(c);
                  s = sb.toString();
                  flag = true;
                  break;
               }
            }
         }
      }
      return s;
   }
}
