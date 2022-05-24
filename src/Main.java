public class Main {

    public static void main(String[] args) {

            Book[] books = new Book[5];

            Author author1 = new Author("Джоан","Роулинг");
            Author author2 = new Author("Джон", "Толкин");
            Author author3 = new Author("Stephen", "King");

            Book book0 = new Book("Гарри Поттер и Философский Камень", 1995, author1);
            Book book1 = new Book("Властелин Колец", 1954, author2);
            Book book2 = new Book("Гарри Поттер и Тайная комната", 2000, author1);
            Book book3 = new Book("The Stand",1978,author3);


            book0.setYearOfPublication(1994); // заменил год
            AddNewBook(book0,books);
            AddNewBook(book1,books);
            AddNewBook(book2,books);
            AddNewBook(book3,books);
            PrintAllBooks(books);


        }

        public static void AddNewBook(Book book, Book[] books){
            for (int i = 0; i < books.length; i++) {
               if(books[i] == null){
                   books[i] = book;
                   break;
               }
            }
        }

    public static void PrintAllBooks(Book[]books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].toString());
            }
        }
    }

    }