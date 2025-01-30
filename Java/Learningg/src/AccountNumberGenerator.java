import java.util.UUID;

public class AccountNumberGenerator {
    public static String generateAccountNumber() {
        // Generate a UUID and extract numeric parts for the account number
        String uuid = UUID.randomUUID().toString();
        return uuid.replaceAll("[^0-9]", "").substring(0, 10); // Get first 10 digits
    }

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println("Generated Account Number: " + generateAccountNumber());
        }
    }
}
