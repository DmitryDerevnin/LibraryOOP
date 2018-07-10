package interfaces;

import impl.Book;

import java.util.List;

public interface LibraryInterface {
    void addBook(int id, String author, String name);

    void deleteBook(int id, String author, String name);

    List<Book> searchBook(String name);

}
