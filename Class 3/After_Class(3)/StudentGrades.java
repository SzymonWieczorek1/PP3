import java.util.*;

public class StudentGrades{
    
    String studentName;
    double[] grades;
    int numberOfGrades;
    
    public StudentGrades(String name, int numberOfGrades){
        this.studentName = name;
        this.numberOfGrades = numberOfGrades;
        this.grades = new double[numberOfGrades];
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide grades: ");
        for(int i =0; i<numberOfGrades;i++)
            this.grades[i] = Double.parseDouble(scan.nextLine());
        
    }
    static double lowestGrade(double[] grades){
        return Arrays.stream(grades).min().getAsDouble();
    }
    static double highestGrade(double[] grades){
        return Arrays.stream(grades).max().getAsDouble();
    }
    static double numberOfGrades(double[] grades){
        return grades.length;
    }
    static double average(double[] grades){
        return Arrays.stream(grades).average().getAsDouble();
    }
    void displayInfo(){
        System.out.println("Name: "+studentName);
        System.out.println("Lowest Grade: "+lowestGrade(grades));
        System.out.println("Highest Grade: "+highestGrade(grades));
        System.out.println("Average: "+average(grades));
        
    }
    
    public static void main(String[] args){
        StudentGrades student1 = new StudentGrades("Amanda",6);
        StudentGrades student2 = new StudentGrades("James",7);
        student1.displayInfo();
        student2.displayInfo();
        
    }
    
}
