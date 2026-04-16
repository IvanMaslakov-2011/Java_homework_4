import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Integer> grades;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        setAge(age);
        this.grades = new ArrayList<>();
    }

    public static void main(String[] args) {
        Student student1 = new Student("Joe", 16);

        student1.addGrade(10);
        student1.addGrade(12);
        student1.addGrade(9);
        student1.getAverage();
        student1.displayInfo();

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 6 && age < 30) {
            this.age = age;
        } else {
            this.age = 18;
        }
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getAverage() {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
            count++;
        }

        int res = sum / count;

        return res;
    }

    public void displayInfo() {
        System.out.println("Ім'я: " + name + "\nВік: " + age + "\nОцінки: " + grades);
    }
}
