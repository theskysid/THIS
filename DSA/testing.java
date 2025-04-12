import java.util.Stack;

public class testing {
    public static void main(String[] args) {
        String s = "abcd";
        Stack<Integer> st = new Stack<>();
        char[] sarray = s.toCharArray();
        for(char c : sarray){
            System.out.println(sarray[c]);
        }
    }
}
