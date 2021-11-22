public class Student{
    
    int age;
    String name;
    String id;
    boolean idValid;
    int sem;
    double grade;
    
    void sayHello(){
        System.out.println("Hello world!");
    }
    
    void displayName(){
        System.out.println("Name: "+name);
    }
    
    void displayAge(){
        System.out.println("Age: "+age);
    }
    
    void displayInfo(){
        System.out.println("\nName: "+name+"\nSemester: "+sem+"\nAverage grade: "+grade);
        System.out.println("Name: "+name+"\nID: "+id+"\nValid: "+idValid);
    }
    
    void changeStatus(){
        idValid =! idValid;
    }
    
    
}