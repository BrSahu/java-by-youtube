 class Book {
    static int totalbooks;
    String title;
    String author;
    String isbn;

    boolean isborrowed;
    static {
         totalbooks = 0 ;
    }
     {   //object init
         totalbooks++;
     }
     Book(String isbn, String title,String author){
       this.isbn = isbn;
        this.title = title;
        this.author = author;
     }

     Book(String isbn){
        this(isbn,"unknown","unknown");
     }

     static int getTotalbooks(){
        return totalbooks;
     }
     void borrowbook(){
        if (isborrowed){
            System.out.println("book is already borrowed");
        }else {
            this.isborrowed = true;
            System.out.println("enjoy "+ this.title);
        }
     }

   void returnbook(){
        if(isborrowed){
            this.isborrowed = false;
            System.out.println("hope u enjoyed , please leave a review");
        }else{
            System.out.println("this book is already in thr library");
        }
   }

     public static void main(String[] args) {
         Book designOfThings = new Book("1","design","unknown");
         Book myBook = new Book("2");
         System.out.println(Book.getTotalbooks());
         designOfThings.borrowbook();
         myBook.borrowbook();
         designOfThings.borrowbook();
         designOfThings.returnbook();
         designOfThings.returnbook();
     }
}
