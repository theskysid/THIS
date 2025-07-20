package Z_GFG.Bank.Learningg.Base64;

import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Base64.Decoder;

public class Base64StringExample {
   public static void main(String[] args) {
      String original = "Java Base64";

      // Step 2: Get Encoder and Decoder using static factory methods
      Encoder encoder = Base64.getEncoder();   // import java.util.Base64.Encoder;
      Decoder decoder = Base64.getDecoder();   // import java.util.Base64.Decoder;

      // Step 3: Encode byte[] using encode() method
      byte[] encodedBytes = encoder.encode(original.getBytes());

      // Step 4: Convert encoded bytes to String
      String encodedString = new String(encodedBytes);
      System.out.println("Encoded String: " + encodedString);

      String decodedString = new String(decoder.decode(encodedBytes));
      System.out.println("Decoded String: " + decodedString);
   }
}
