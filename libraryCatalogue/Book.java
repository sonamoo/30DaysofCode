package librarycatalog;

public class Book {
    
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut; // weather or not the book is checked out.
    int dayCheckedOut = -1;
    
    // Constructor
    public Book(String bookTitle, int bookPageCount, int bookISBN) {
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN = bookISBN;
        isCheckedOut = false;   
    }
    
    // Getters  --> INSTANCE METHODS
    public String getTitle() {
        return this.title;
    }
    public int getPageCount() {
        return this.pageCount;   
    }
    public int getISBN() {
        return this.ISBN;
    }
    public boolean getIsCheckedOut() {
        return this.isCheckedOut;
    }
    public int getDayCheckedOut() {
        return this.dayCheckedOut;
    }
    
    // Setters
    public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedout) {
        this.isCheckedOut = newIsCheckedOut;
        this.dayCheckedOut = currentDayCheckedout;
        setDayCheckedOut(currentDayCheckedout);
    }
    
    private void setDayCheckedOut(int day) {
        this.dayCheckedOut = day;
    }
}
