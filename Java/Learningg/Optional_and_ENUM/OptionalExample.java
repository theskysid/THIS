package Z_GFG.Bank.Learningg.Optional_and_ENUM;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalExample {
   public static void main(String[] args) {

      //optional is used to handle the null pointer exception
      // it uses a box which contains value ... if the value is null it returns an empty box not null

      Optional<String> optionalNameBox = getName();

      //works perfectly for value but gives error in case of null because we have used .of but when we use
      // ofNullable it handles the nullpointer exception
      if (optionalNameBox.isPresent()) {
         System.out.println(optionalNameBox.get());
      }


      //lambda expression for the same
      // when there is null .. the if present will ignore it and do not run anything
      optionalNameBox.ifPresent(x -> System.out.println(x));

      //if the optional box is empty this runs
      String res = optionalNameBox.orElse("NOT FOUND");
      String res2 = optionalNameBox.orElseGet(() -> "NOT FOUND");
      String res3 = optionalNameBox.orElseThrow(()->new NoSuchElementException("Not found"));
      System.out.println(res);
      System.out.println(res2);
      System.out.println(res3);

   }

   public static Optional<String> getName(){

      Optional<String> name1 = Optional.ofNullable("Sky");  // ✅ Wraps "Sky"
      Optional<String> name2 = Optional.ofNullable(null);   // ✅ Becomes Optional.empty()


      //return Optional.of("MIKE");
      //return Optional.ofNullable("JavaTpoint");
      return Optional.ofNullable(null);

   }
}
