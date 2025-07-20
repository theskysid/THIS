package Z_GFG.Bank.Learningg.MethodReference;

class Helper {
   static void greet() {
      System.out.println("Hello!");
   }
}

public class staticmethod {
   public static void main(String[] args) {
      Runnable r = Helper::greet;
      r.run();  // Output: Hello!
   }
}
