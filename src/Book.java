import java.util.Objects;

public class Book {

    private String nameOfBook;
    private int yearOfPublication;
    public Author author;

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
        return yearOfPublication == book.yearOfPublication && Objects.equals(nameOfBook, book.nameOfBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, yearOfPublication);
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String toString(){
        return this.author + this.nameOfBook + " : " + this.yearOfPublication;
    }
}
class Author {

    private String nameAuthor;
    private String surnameAuthor;

    @Override
    public String toString() {
        return  nameAuthor + " " + surnameAuthor + " : ";
    }

    public Author(String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(surnameAuthor, author.surnameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, surnameAuthor);
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getSurnameAuthor() {
        return this.surnameAuthor;
    }

}
