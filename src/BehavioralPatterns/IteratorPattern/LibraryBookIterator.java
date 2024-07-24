package BehavioralPatterns.IteratorPattern;

import java.util.List;

class LibraryBookIterator implements BookIterator
{
    private List<Book> books;
    private int index=0;

    public LibraryBookIterator(List<Book> books)
    {
        this.books=books;

    }

    @Override
    public boolean hasNext() {
        return index < books.size();
          }

    @Override
    public Book next() {
        return books.get(index++);
           }

}