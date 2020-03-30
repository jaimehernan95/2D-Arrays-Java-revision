public class Book {
    //2 D array review

    // properties, field global variables

    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut; // whether or not the book is checked out
    int dayCheckedOut = -1;

    //Constructor
    public Book(String bookTitle, int bookPageCount, int bookISBN){

        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN = bookISBN;
        this.isCheckedOut = false;
    }

    //getters instances methods

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

    public int getDayCheckedOut()  {

        return this.dayCheckedOut;

    }

    //SETTERS

    public void setIsCheckedOut (boolean newIsCheckedOut, int currentDayCheckedOut) {
        this.isCheckedOut = newIsCheckedOut;
        //the code below will allow access the method private void setdaycheckout
        setDayCheckedOut(currentDayCheckedOut);
    }
    // private library catalog can not access this method, only can be accessed here
    private void setDayCheckedOut(int day) {
        this.dayCheckedOut = day;
    }
}
