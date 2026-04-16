public class Person {

    private String name;
    private int age;
    private double moneyUAH;

    public Person(String name, int age, double moneyUAH) {
        this.name = name;
        setAge(age);
        setMoneyUAH(moneyUAH);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Joe", 15, 10000);
        person1.converToUSD(42);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Вік не може бути від'ємним!");
        }
    }

    public double getMoneyUAH() {
        return moneyUAH;
    }

    public void setMoneyUAH(double moneyUAH) {
        if (moneyUAH >= 0) {
            this.moneyUAH = moneyUAH;
        } else {
            throw new IllegalArgumentException("Кількість грошей не може бути менше нуля!");
        }
    }

    public void converToUSD(double rate) {
        if (rate > 0) {
            System.out.println("Ваші гроші у USD: " + (moneyUAH / rate));
        } else {
            throw new IllegalArgumentException("Курс має бути більше нуля!");
        }
    }
}
