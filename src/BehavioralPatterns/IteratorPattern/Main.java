package BehavioralPatterns.IteratorPattern;
public class Main{
    public static void main(String args[])
    {
        Bookshelf bs= new Bookshelf();
        bs.addBook(new Book("Harry Potter"));
        bs.addBook(new Book("The Lord of the Rings"));

        BookIterator it= bs.iterator();
        while(it.hasNext())
        {
           Book book =it.next();
           System.out.println("Book" + book.getTitle());
        }
    }
    
}