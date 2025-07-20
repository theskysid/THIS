package Z_GFG.Bank.Learningg.Base64;

import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Base64.Decoder;

public class MIMEBase64Example {
   public static void main(String[] args) {
      String original = "This is a long message used to demonstrate MIME Base64 encoding in Java. It will include line breaks after every 76 characters as per MIME standard.";

      // Get MIME encoder and decoder
      Encoder mimeEncoder = Base64.getMimeEncoder();   // adds line breaks
      Decoder mimeDecoder = Base64.getMimeDecoder();

      // Encode using .encode() (no separate byte array variable)
      String encoded = new String(mimeEncoder.encode(original.getBytes()));
      System.out.println("MIME Encoded String:\n" + encoded);

      // Decode the MIME Base64 string
      String decoded = new String(mimeDecoder.decode(encoded));
      System.out.println("\nDecoded String:\n" + decoded);
   }
}
