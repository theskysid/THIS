package Leetcode;

public class M_longest_palindromic_string_5 {

    //complexity fix  O(n3) here
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {

                String sub = s.substring(i, j);  //manually checking all the substring

                if (isPalindrome(sub) && sub.length() > longest.length()) { //checking if the sub is longer or not
                    longest = sub;
                }
            }
        }

        return longest;
    }

    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        M_longest_palindromic_string_5 lp = new M_longest_palindromic_string_5();
        String result = lp.longestPalindrome("babad");
        System.out.println("Longest Palindromic Substring: " + result);
    }
}

