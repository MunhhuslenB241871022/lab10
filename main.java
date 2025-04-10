public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(lib.new Book("Сүүн Зам", 2020));
        lib.addBook(lib.new Book("Сэтгэлгээ", 1999));

        for (Library.Book b : lib.bookShelf(2000)) {
            System.out.println(b);
        }
    }
}
