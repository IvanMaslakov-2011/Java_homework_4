import java.util.ArrayList;

class libraryBook {
    private String title;
    private String author;
    private int year;
    private int pages;
    private boolean isAvailable;

    public libraryBook(String title, String author, int year, int pages, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
        this.isAvailable = isAvailable;
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

    public String getTitle() {
        return title;
    }

    public boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

public class Library {

    public static void main(String[] args){
        Library library1 = new Library();

        libraryBook book1 = new libraryBook("The Chronicles of Narnia", "C.S. Lewis", 1950, 800, true);
        libraryBook book2 = new libraryBook("The Lord of the Rings", " John R. R. Tolkien", 1954, 1200, true);
        libraryBook book3 = new libraryBook("Atomic Habits", "James Clear", 2018, 320, true);
        libraryBook book4 = new libraryBook("Don Quixote", " Miguel de Cervantes", 1605, 100, true);
        libraryBook book5 = new libraryBook("Mere Christianity", "C. S. Lewis", 1952, 210, true);

        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        library1.addBook(book4);
        library1.addBook(book5);

        library1.borrowBook("Atomic Habits");
        library1.returnBook("Atomic Habits");

        library1.borrowBook("Mere Christianity");
        library1.returnBook("Mere Christianity");

        library1.listAvailableBooks();
    }

    private ArrayList<libraryBook> books = new ArrayList<libraryBook>();

    public void addBook(libraryBook book) {
        books.add(book);
    }

    public void borrowBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            libraryBook currentBook = books.get(i);

                if (currentBook.getTitle().equals(title)) {

                    if (currentBook.getAvailable()) {
                        currentBook.setAvailable(false);
                    }
                    else {
                    System.out.println("Вибачте книга недоступна!");
                }
                    return;
            }
        }
        System.out.println("Вибачте, але книги " + title + " не має у нашій бібліотеці!");
    }

    public void returnBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            libraryBook currentBook = books.get(i);

            if (currentBook.getTitle().equals(title)) {
                if (!currentBook.getAvailable()) {
                    currentBook.setAvailable(true);
                } else {
                    System.out.println("Ця книга на місці!");
                }
                return;
            }
        }
        System.out.println("Вибачте, але книги " + title + " не має у нашій бібліотеці!");
    }

    public void listAvailableBooks() {

        for (int i = 0; i < books.size(); i++) {

            if(books.get(i).getAvailable()){
                System.out.println( (i + 1) + ". Книга: " + books.get(i).getTitle());
            }
        }
    }

    public libraryBook findBookByTitle(String title) {
        for (int i = 0; i < books.size(); i++){
            libraryBook currentBook = books.get(i);

            if (currentBook.getTitle().equals(title)){
                return currentBook;
            }
        }
        System.out.println("Вибачте, але книги " + title + " не знайдено!");

        return null;
    }
}


