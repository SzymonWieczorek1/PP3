
public class Student
{
    
    int age;
    String surname;
    String name;
    int semester;
    String studentId;
    boolean idValid;
    float averageGrade;
    
    
    
    
    void sayHello(){
        System.out.println("Hello World!");
    
    };
    void displayName(){
        System.out.println(name);
    
    };
    void displayAge(){
        System.out.println(age);
    
    };
    void displayInfo(){
        System.out.println("Name: "+name+", Semestr:" + semester+", Grade:"+averageGrade);
    };
    void changeStatusFalse(){
        idValid = !idValid;
        };   
    void displayInfo2(){
        System.out.println(name+"," +studentId+","+idValid);
    };
}
