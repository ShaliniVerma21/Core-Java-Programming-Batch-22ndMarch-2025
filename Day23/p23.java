package Day23;

/*
 * 16. Base64 Encoding & Decoding
 * ------------------------------------------------------------
 * Description: Base64 API provides methods to encode binary data into a string format and decode it back.
 * Purpose: Used for safe transmission of binary data over text-based protocols (like JSON, XML, or HTTP).
 * Real Example: Encoding passwords, tokens, or images before sending them to a web service.
 */

import java.util.Base64;

public class p23{
    public static void main(String[] args) {
        // Original message
        String msg = "JDK8 Rocks!";
        
        // Encoding message to Base64
        String encoded = Base64.getEncoder().encodeToString(msg.getBytes());
        System.out.println("Encoded: " + encoded);
        
        // Decoding Base64 string back to original
        String decoded = new String(Base64.getDecoder().decode(encoded));
        System.out.println("Decoded: " + decoded);
    }
}
