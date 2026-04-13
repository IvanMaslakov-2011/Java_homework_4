import java.security.SecureRandom;
import java.util.Scanner;

public class Third {

    private static final char[] SYMBOLS =
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+[]{}|;:,.<>?".toCharArray();
    private static final SecureRandom random = new SecureRandom();

    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть бажану довжину пароля: ");
        int len = sc.nextInt();

        System.out.println("Ваш пароль: " + generatePassword(len));
    }

    public static String generatePassword(int len) {

        if (len < 4) {
            throw new IllegalArgumentException("Довжина повинна бути не менше 4 символів!");
        }

        StringBuilder password = new StringBuilder(len);

        for (int i = 0; i < len; i++) {
            char randomChar = SYMBOLS[random.nextInt(SYMBOLS.length)];
            password.append(randomChar);
        }
        return password.toString();
    }
}