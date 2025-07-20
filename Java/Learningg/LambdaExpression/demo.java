package Z_GFG.Bank.Learningg.LambdaExpression;

@FunctionalInterface
interface Art {
   public void draw();

   default void print() {

   }
}
public class demo{
   public static void main(String[] args) {
      int width  = 10;
//      Art a = new Art() {
//         @Override
//         public void draw() {
//            System.out.println("drawing...");
//         }
//      };
//      a.draw();
         Art b = () -> {
            System.out.println("Drawing...");
         };

         b.draw();
   }
}
