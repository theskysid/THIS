package Z_GFG.Bank.Learningg.MethodReference;

interface MyInterface {
   constructerreference create();
}

class constructerreference {
   constructerreference() {
      System.out.println("Constructor called!");
   }

   public static void main(String[] args) {
      MyInterface m = constructerreference::new;
      m.create();  // Output: Constructor called!
   }
}
