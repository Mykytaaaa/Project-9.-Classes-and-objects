package Part2;

public class Book {
    public String name;
    private int pages;
    public Book() {
        name = "Unknown book";
        pages = 1;
    }
    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int newValue) {
        pages = newValue;
    }

    public String getFullDesc() {
        return name + " " + getPages() + " pages";
    }
}
