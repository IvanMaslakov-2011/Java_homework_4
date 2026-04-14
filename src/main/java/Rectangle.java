public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(15, 10);
        Rectangle rectangle2 = new Rectangle(10, 10);

        System.out.println("Площа прямокунтника: " + rectangle1.getArea() + ";");
        System.out.println("Периметр прямокунтника: " + rectangle1.getPerimeter() + ";");
        if (rectangle1.isSquare()) {
            System.out.println("Ваш прямокутник - це квадрат!");
        } else {
            System.out.println("Ваш прямокутник не є квадратом!");
        }

        System.out.println("Площа прямокунтника: " + rectangle2.getArea() + ";");
        System.out.println("Периметр прямокунтника: " + rectangle2.getPerimeter() + ";");
        if (rectangle2.isSquare()) {
            System.out.println("Ваш прямокутник - це квадрат!");
        } else {
            System.out.println("Ваш прямокутник не є квадратом!");
        }

    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean isSquare() {

        if (width == height) {
            return true;
        }
        return false;
    }


}
