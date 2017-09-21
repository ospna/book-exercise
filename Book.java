/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;

    /**
     * Set the author and title and pages fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numOfPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numOfPages;
    }
    
    
    /**
     * Return the name of the Author
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * Return the title of the Book
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Print the author's name to the output terminal
     */
    public void printAuthor()
    {
        System.out.println("Author's name: " + author);
    }
    
    /**
     * Print the title of the book to the output terminal
     */
    public void printTitle()
    {
        System.out.println("Title of the book: " + title);
    }
    
    /**
     * Return the number of pages in the book
     */
    public int getPages()
    {
        return pages;
    }
    
    // Add the methods here ...
}
