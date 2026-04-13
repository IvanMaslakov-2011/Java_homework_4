import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        System.out.println("Введіть число (більше 0): ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num <= 0) {
            throw new IllegalArgumentException("Число має бути більше 0!");
        } else {
            System.out.println("Числа Фібоначчі від 0 до " + num + ": ");
            printFibonacci(num);
            System.out.println();
            System.out.println("Факторіал " + num + " становить: " + factorial(num));
            System.out.println("Сума символів: " + num + " становить: " + sumOfDigits(num));
        }
    }

    public static void printFibonacci(int n){

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++){
            System.out.print(a + ", ");

            int temp = a;

            a = b;

            b = temp + b;
        }
    }

    public static long factorial(int n){
        long res = 1;

        for (int i = 1; i <= n; i++){
            res *= i;
        }

        return res;
    }

    public static int sumOfDigits(int n){

        int sum = 0;

        while (n > 0){

            int lastNum = n % 10;

            sum += lastNum;

            n /= 10;
        }
        return sum;
    }
}
