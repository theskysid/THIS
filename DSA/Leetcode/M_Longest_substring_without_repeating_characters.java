package Leetcode;

public class M_Longest_substring_without_repeating_characters {




    //this code is not optimal but works for certain smaller inputs... leetcode did not accepted
//    public static int lengthOfLongestSubstring(String s) {
//        String longest = "";
//        for(int i = 0; i<s.length();i++){
//            for(int j = i+1; j<=s.length();j++){
//                String sub = s.substring(i,j);
//
//                if(unique(sub) && sub.length() > longest.length()){
//                    longest = sub;
//                }
//
//            }
//        }
//        return longest.length();
//    }
//    public static boolean unique(String s){
//        if(s.length() == 1) return true;
//        for(int i = 0; i<s.length();i++){
//            for(int j=i+1;j<s.length();j++){
//                if(s.charAt(i) ==s.charAt(j)) return false;
//            }
//        }
//        return true;
//    }

    public static void main(String[] args) {
        
    }
}
