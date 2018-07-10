package impl;

public class Book {
    private String author;
    private String name;
    private int id;

    public Book(){

    }

    public Book(int id, String author, String name){
        this.id = id;
        this.author = author;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
