package Part2;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Book1", 250);
        Book book2 = new Book();
        book2.name = "Book2";
        book2.setPages(100);

        System.out.println(book1.getFullDesc());
        System.out.println(book2.getFullDesc());
    }
}
