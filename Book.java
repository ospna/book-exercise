/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (IGiovanny Ospina)
 * @version (9/24/2017)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;

    /**
     * Set the author, title and pages fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numOfPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numOfPages;
        refNumber = ("");
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
     * Print the author's name to the output terminal window
     */
    public void printAuthor()
    {
        System.out.println("Author's name: " + author);
    }
    
    /**
     * Print the title of the book to the output terminal window
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
    
    /**
     * Print the details of the author, title, and amount 
     * of pages of the book to the output terminal
     */
    public void printDetails()
    {
        System.out.println("Title of the book: " + title + ", ");
        System.out.println("Author: " + author + ", ");
        System.out.println("Pages: " + pages + ", ");
    }
    
    /**
     * Sets a reference number for the book
     */
    public void setRefNumber(String ref)
    {
        refNumber = ref;
    }

    /**
     * Gets the reference number for the book
     */
    public String getRefNumber()
    {
        return refNumber;
    }// Add the methods here ...
}
