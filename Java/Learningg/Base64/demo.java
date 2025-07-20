package Z_GFG.Bank.Learningg.Base64;

import java.util.Base64;

public class demo {
   public static void main(String[] args) {
      // Step 1: Create a Base64 encoder instance
      Base64.Encoder encoder = Base64.getEncoder();

      // Step 2: Define a simple byte array (raw binary data)
      byte[] byteArr = {1, 2};

      // Step 3: Encode the byte array to Base64
      byte[] byteArr2 = encoder.encode(byteArr);

      // WARNING: This prints memory reference, not actual content
      System.out.println("Encoded byte array (memory reference): " + byteArr2);

      // Correct way: Convert Base64 bytes to String to see the actual encoded value
      System.out.println("Base64 string from byte array: " + new String(byteArr2));

      // Step 4: Encode again, but this time write the result into a pre-allocated byte array
      byte[] byteArr3 = new byte[5];  // Must be large enough to hold Base64 output

      // Encodes byteArr and stores result in byteArr3, returns number of bytes written
      int x = encoder.encode(byteArr, byteArr3);

      // Convert encoded byte array to string to print actual Base64 result
      System.out.println("Base64 written into pre-allocated array: " + new String(byteArr3));
      System.out.println("Number of bytes written into pre-allocated array: " + x);

      // Step 5: Encode a string to Base64
      String str = encoder.encodeToString("JavaTpoint".getBytes());
      System.out.println("Base64 encoded string: " + str);

      // Step 6: Create a decoder to reverse the Base64 back to original
      Base64.Decoder decoder = Base64.getDecoder();

      // Decode Base64 string and convert back to regular string
      String dStr = new String(decoder.decode(str));
      System.out.println("Decoded (original) string: " + dStr);
   }
}
