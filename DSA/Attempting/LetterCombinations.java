package Attempting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LetterCombinations {
   public List<String> letterCombinations(String digits) {
      List<String> ans = new ArrayList<>();
      if(digits.length() == 0) return new ArrayList<>();
      solve(ans, "", digits, 0, getMap());
      return ans;
   }
   public void solve(List<String> ans ,String p, String up, int idx, Map<Character, String> map) {
      if(idx == up.length()) {
         ans.add(p);
         return;
      }

      for(char ch : map.get(up.charAt(idx)).toCharArray()) {
         String temp = p;
         temp += ch;
         solve(ans, temp, up, idx + 1, map);

      }
   }
   private static Map<Character, String> getMap() {
      Map<Character, String> map = new HashMap<>();
      map.put('2', "abc");
      map.put('3', "def");
      map.put('4', "ghi");
      map.put('5', "jkl");
      map.put('6', "mno");
      map.put('7', "pqrs");
      map.put('8', "tuv");
      map.put('9', "wxyz");

      return map;
   }

   public static void main(String[] args) {
      LetterCombinations lc = new LetterCombinations();
      System.out.println(lc.letterCombinations("23"));
   }
}