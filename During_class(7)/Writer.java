public class Writer{
    private String name;
    private int yearOfBirth;
    private boolean isAlive;
    private String surname;
    private int numberOfBooks;
    
    public Writer(String name, int yearOfBirth, boolean isAlive, String surname, int numberOfBooks){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.isAlive = isAlive;
        this.surname = surname;
        this.numberOfBooks = numberOfBooks;
    }
    
    String getName(){
        return name;
    }
    
    String getSurname(){
        return surname;
    }
    
    public String toString(){
        return "Name: "+name+"\nSurname: "+surname;
    }
}