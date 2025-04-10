import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
    }

    public BookShelf bookShelf(int minYear) {
        return new BookShelf(minYear);
    }

    public class Book {
        private String title;
        private int year;

        public Book(String title, int year) {
            this.title = title;
            this.year = year;
        }

        public int getYear() {
            return year;
        }

        public String toString() {
            return title + ": " + year;
        }
    }

    public class BookShelf implements Iterable<Book> {
        private int minYear;

        public BookShelf(int minYear) {
            this.minYear = minYear;
        }

        @Override
        public Iterator<Book> iterator() {
            return books.stream()
                    .filter(b -> b.getYear() >= minYear)
                    .iterator();
        }
    }
}
