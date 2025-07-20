package Z_GFG.Bank.Learningg.Base64;

import java.util.Base64;

public class url {
   public static void main(String[] args) {
      String data = "www.youtube.com";

      // Get URL-safe encoder
      Base64.Encoder urlEncoder = Base64.getUrlEncoder();

      // Encode
      String encoded = urlEncoder.encodeToString(data.getBytes());
      System.out.println("URL-safe Base64: " + encoded);

      // Decode
      Base64.Decoder urlDecoder = Base64.getUrlDecoder();
      String decoded = new String(urlDecoder.decode(encoded));
      System.out.println("Decoded: " + decoded);
   }
}
