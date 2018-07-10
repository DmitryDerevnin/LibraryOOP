package demo;

import impl.Book;
import impl.Library;
import interfaces.LibraryInterface;

public class LibraryDemo {
    // Реализуйте методы добавления, удаления и поиска книги.
    // Ограничение - используйте массивы заранее фиксированного размера.
    // При превышении размера массива при добавлении следует игнорировать операцию добавления

    public LibraryDemo() {
        Library library = new Library();
        Book book = new Book();
        library.setLibrarySize(10);

        library.addBook(1, "N. Gogol", "Dead souls. First tome");
        library.addBook(2, "N. Gogol", "Dead souls. Three tome");

        library.deleteBook(2, "N. Gogol", "Dead souls. Three tome");

        library.searchBook("Dead souls. First tome");
        for (Book bookName: library.getBookList()) {
            System.out.println(bookName.getName());
        }

    }
}
