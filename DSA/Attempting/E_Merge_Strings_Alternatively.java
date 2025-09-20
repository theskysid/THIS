package Leetcode;

public class E_Merge_Strings_Alternatively {

    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab" , "pqrs"));
    }

    static String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            res.append(word1.charAt(i++));
            res.append(word2.charAt(j++));
        }
        while (i < word1.length()) {
            res.append(word1.charAt(i++));
        }
        while (j < word2.length()) {
            res.append(word2.charAt(j++));
        }
        return res.toString();
    }

}
