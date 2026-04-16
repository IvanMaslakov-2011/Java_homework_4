import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть число: ");
        int num = sc.nextInt();

        if (!isEven(num)) {
            System.out.print("Число не парне, ");
        } else {
            System.out.print("Число парне, ");
        }

        if (!isPrime(num)) {
            System.out.print("непросте, ");
        } else {
            System.out.print("просте, ");
        }

        if (!isPalindrome(num)) {
            System.out.print("та не паліндром!");
        } else {
            System.out.print("та    паліндром! ");
        }
    }


    public static boolean isEven(int num) {

        return num % 2 == 0;
    }

    public static boolean isPrime(int num) {
        boolean isPrime;

        if (num < 2) {
            isPrime = false;
        } else if (num % 2 == 0) {
            isPrime = false;
        }

        for (int i = 3; i < Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                isPrime = false;
                return isPrime;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int num) {

        if (num < 0) {
            return false;
        }

        int org = num;
        int reversed = 0;

        while (num > 0) {
            int lastNum = num % 10;
            reversed = reversed * 10 + num;

            num /= 10;
        }

        return org == reversed;
    }
}

