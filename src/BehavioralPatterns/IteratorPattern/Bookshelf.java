package BehavioralPatterns.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

class Bookshelf
{
    private List<Book> books= new ArrayList<>();
    
    public void addBook(Book book)
    {
        books.add(book);
    }

    public BookIterator iterator()
    {
        return new LibraryBookIterator(books);
    }
}