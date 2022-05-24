import java.util.Objects;

public class Book {

    private String nameOfBook;
    private int yearOfPublication;
    private Author author;

    public Book(String nameOfBook, int yearOfPublication, Author author) {
        this.nameOfBook = nameOfBook;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getNameOfBook() {
        return this.nameOfBook;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(nameOfBook, book.nameOfBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, yearOfPublication, author);
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String toString(){
        return this.author + this.nameOfBook + " : " + this.yearOfPublication;
    }
}

