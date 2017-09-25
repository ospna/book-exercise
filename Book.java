/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Giovanny Ospina)
 * @version (9/24/2017)
 */

class Book
{
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author, title and pages fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numOfPages, boolean courseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numOfPages;
        refNumber = "";
        courseText = true;
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
     * Sets the reference number for the book
     */
    public void setRefNumber(String ref)
    {
        if(ref.length() >= 3)
        {
            refNumber = ref;
        }
        else
        {
            System.out.println("Error. Reference number must be at least three characters long!");
        }
    }
    
    /**
     * Gets the reference number for the book
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /**
     * Increments the number of times the book has been borrowed
     */
    public void borrow()
    {
        borrowed++;
    }
    
    /**
     * Gets the number of times the book has been borrowed
     */
    public int getBorrowed()
    {
        return borrowed;
    }
    
    /**
     * Determines whether or not the book is being used as 
     * a text book on a course
     */
    
    public boolean isCourseText()
    {
        return courseText;
    }
    
    /**
     * Print the details of the author, title, and amount 
     * of pages of the book to the output terminal
     */
    public void printDetails()
    {
        System.out.println("Title of the book: " + title + ", ");
        System.out.println("Author: " + author + ", ");
        System.out.println("Pages: " + pages);
        
        String refNumberString;
        if(refNumber.length() > 0)
        {
            refNumberString = refNumber;
        }
        else
        {
            refNumberString = "ZZZ";
        }
        
        System.out.println("Reference number: " + refNumberString);
        System.out.println("The book has been borrowed " + borrowed + " times.");
    } 
    
}
