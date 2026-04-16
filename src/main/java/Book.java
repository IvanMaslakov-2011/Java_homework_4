public class Book {

    private String title;
    private String author;
    private int year;
    private int pages;
    public Book(String title, String author, int year, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Chronicles of Narnia", "C.S. Lewis", 1950, 800);
        Book book2 = new Book("The Lord of the Rings", " John R. R. Tolkien", 1954, 1200);

        book1.displayInfo();
        if (book1.isLong()) {
            System.out.println("Сторінок більше 300!");
        } else {
            System.out.println("Книга не довга! Сторінок менше 300!");
        }

        book2.displayInfo();
        if (book2.isLong()) {
            System.out.println("Сторінок більше 300!");
        } else {
            System.out.println("Книга не довга! Сторінок менше 300!");
        }
    }

    public void displayInfo() {
        System.out.println("Назва: " + title + ";");
        System.out.println("Автор: " + author + ";");
        System.out.println("Рік: " + year + ";");
        System.out.println("Кількість сторінок: " + pages + ";");
    }

    public boolean isLong() {
        return pages > 300;
    }
}
