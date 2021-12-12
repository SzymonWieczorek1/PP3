public class Book{
    private String title;
    private int yearOfRelease;
    private Writer author;
    private int pages;
    private String publisher;
    
    public Book(String title, int yearOfRelease, Writer author, int pages, String publisher){
        this.title = title;
        this.yearOfRelease = yearOfRelease;
        this.author = author;
        this.pages = pages;
        this.publisher = publisher;
    }
    
    public void setPublisher(String newPublisher){
        this.publisher = newPublisher;
    }
    
    public String toString(){
        return "Title: " +title+"\nAuthor: ["+author.toString()+"]"+"\nPages: "+pages+" Publisher: "+publisher;
    }
    
    public static void main(String[] args){
        Writer w1 = new Writer("Andrzej",1990,true,"Miśkiewicz",4);
        Book b1 = new Book("Król Karol",2020,w1,323,"Nowa");
        
        System.out.println(b1);
    }
}