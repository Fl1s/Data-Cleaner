import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        String password = generatePassword(5);//put you length
        System.out.println("New password: " + password);
    }

    public static String generatePassword(int length) {
        if (length < 5 || length > 20) {
            throw new IllegalArgumentException("Invalid input parameters");
        }

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        while (password.length() < length) {
            char nextChar = generateRandomChar();
            password.append(nextChar);
        }

        return password.toString();
    }

    private static char generateRandomChar() {
        SecureRandom random = new SecureRandom();
        String validChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-=_+";
        int index = random.nextInt(validChars.length());
        return validChars.charAt(index);
    }
}
