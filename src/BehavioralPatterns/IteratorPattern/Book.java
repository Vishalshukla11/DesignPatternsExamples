package BehavioralPatterns.IteratorPattern;
/*Iterator Pattern
Definition: The Iterator pattern provides a way to access the elements of a collection (such as an array or list) sequentially without exposing its underlying structure.

Real-life Example: Library Book Shelf
Imagine a library bookshelf. You want to browse through the books one by one.

Library Book Shelf (Real-life)

Bookshelf: The collection of books.
Iterator: A person going through each book one by one
 */
public class Book{
    private String title;

    public Book(String title)
    {
        this.title=title;
    }
    
    public String getTitle()
    {
        return title;
    }

}