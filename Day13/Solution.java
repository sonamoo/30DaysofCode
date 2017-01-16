class MyBook extends Book {
    private int p;
    
    public MyBook(String title, String author, int price) {
        super(title, author);
        p = price;
    }
    
    @Override 
    public void display() {
        
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + p);
    }
}