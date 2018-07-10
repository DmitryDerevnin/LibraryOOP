package impl;

import interfaces.LibraryInterface;

import java.util.ArrayList;
import java.util.List;

public class Library implements LibraryInterface {

    private List<Book> bookList = new ArrayList<Book>();
    private int librarySize;

    public void addBook(int id, String author, String name) {
        if(bookList.size() == librarySize)
            return;
        this.bookList.add(new Book(id, author, name));
    }

    public void deleteBook(int id, String author, String name){
        this.bookList.remove(this);
    }

    public List<Book> searchBook(String name){
        List<Book> searchResult = new ArrayList<Book>();
        for (int i=0; i < bookList.size(); i++) {
            if(bookList.get(i).toString().contains(name))
                searchResult.add(bookList.get(i));
        }
        return searchResult;
    }

    public void setLibrarySize(int librarySize) {
        this.librarySize = librarySize;
    }

    public int getLibrarySize() {
        return librarySize;
    }

    public List<Book> getBookList() {
        return bookList;
    }
}
