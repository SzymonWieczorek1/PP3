public class books
{
    
    String title;
    String bookId;
    String author;
    int year;
    String genre;
    boolean inStock;
        
    void displayInfo(){
        System.out.println("Info: "+title+", "+author+", "+year+", "+genre+", "+bookId+".");
    
    };
    void displayAuthor(){
        System.out.println(author);
    
    };
    void displayYear(){
        System.out.println(year);
    
    };
    void displayTitle(){
        System.out.println(title);
    };
    void changeStock(){
        inStock = !inStock;
        };   
    void displayInfo2(){
        System.out.println(title+" by " +author+","+inStock);
    };
}
