import java.util.Scanner;

public class First {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть номер фігури площу якої ви хочете обчислити:\n1 - Квадрат;\n2 - Прямокутник;\n3 - Трикутник;\n4 - Коло;");
        int shape = sc.nextInt();
        boolean correctValue = false;


        switch (shape){
            case 1:
                while (!correctValue) {
                    System.out.println("Введіть довжину сторони: ");
                    int squareLength = sc.nextInt();
                    if (squareLength > 0){
                        squareArea(squareLength);
                        correctValue = true;
                    } else {
                        System.out.println("Введіть коректне значення!");
                    }
                }
            break;

            case 2:
                while (!correctValue) {
                    System.out.println("Введіть довжину прямокутника: ");
                    int rectangleLength = sc.nextInt();
                    System.out.println("Введіть ширину прямокутника: ");
                    int rectangleWidth = sc.nextInt();
                    if (rectangleLength > 0 && rectangleWidth > 0) {
                        rectangleArea(rectangleLength, rectangleWidth);
                        correctValue = true;
                    } else {
                        System.out.println("Введіть коректне значення!");
                    }
                }
                break;

            case 3:
                while (!correctValue) {
                    System.out.println("Введіть довжину основи трикутника: ");
                    int triangleBase = sc.nextInt();
                    System.out.println("Введіть довжину висоти трикутника проведеної до основи: ");
                    int triangleHeight = sc.nextInt();
                    if (triangleBase > 0 && triangleHeight > 0) {
                        triangleArea(triangleBase, triangleHeight);
                        correctValue = true;
                    } else {
                        System.out.println("Введіть коректне значення!");
                    }
                }
                break;

            case 4:
                while (!correctValue) {
                    System.out.println("Введіть радіус круга: ");
                    int circleRadius = sc.nextInt();

                    if (circleRadius > 0) {
                        circleArea(circleRadius);
                        correctValue = true;
                    } else {
                        System.out.println("Введіть коректне значення!");
                    }
                }
                break;
        }
    }

    public static void squareArea(int length){
        System.out.println("Площа квадрата дорівнює: " + (length * length));
    }

    public static void rectangleArea(int length, int width){
        System.out.println("Площа прямокутника дорівнює: " + (length * width));
    }

    public static void triangleArea(int base, int height){
        System.out.println("Площа трикутника дорівнює: " + ((base * height) / 2));
    }

    public static void circleArea(int radius){
        System.out.println("Площа круга дорівнює: " + ((radius * radius)) * Math.PI);
    }
}
