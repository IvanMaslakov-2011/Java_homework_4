import java.security.SecureRandom;
import java.util.Scanner;
public class Third {

    private static final char[] SYMBOLS =
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+[]{}|;:,.<>?".toCharArray();
    private static final SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть бажану довжину пароля (6-20): ");
        int len = sc.nextInt();

        System.out.println("Ваш пароль: " + generatePassword(len));
    }

    public static String generatePassword(int len) {

        if (len < 4 || len > 20) {
            throw new IllegalArgumentException("Довжина повинна бути коректною!");
        }

        StringBuilder password = new StringBuilder(len);

        for (int i = 0; i < len; i++) {
            char randomChar = SYMBOLS[random.nextInt(SYMBOLS.length)];
            password.append(randomChar);
        }
        return password.toString();
    }
}