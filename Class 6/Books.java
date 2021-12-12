public class Books{
    String title;
    String author;
    String genre;
    int yearOfRelease;
    
    public Books(String title, String author, String genre, int yearOfRelease){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.yearOfRelease = yearOfRelease;
    }
    
    public String toString(){
        return this.title + ", " + this.author + ", " + this.genre + ", " + this.yearOfRelease;
    }
    
    public void changeGenre(String genre){
        this.genre = genre;
    }
    
    public void setYearOfRelease(int yearOfRelease){
        this.yearOfRelease = yearOfRelease;
    }
}