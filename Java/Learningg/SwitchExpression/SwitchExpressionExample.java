package Z_GFG.Bank.Learningg.SwitchExpression;

public class SwitchExpressionExample {
   public static void main(String[] args) {
      int marks = 72;

      String grade = switch (marks / 10) {
         case 10, 9 -> "A Grade";
         case 8 -> "B Grade";
         case 7 -> {
            System.out.println("Processing C Grade...");
            yield "C Grade";
         }
         case 6 -> {
            System.out.println("Processing D Grade...");
            yield "D Grade";
         }
         default -> {
            System.out.println("Marks too low.");
            yield "Fail";
         }
      };

      System.out.println("Your grade is: " + grade);
   }
}
