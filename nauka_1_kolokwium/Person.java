public class Person{
    
    String name;
    double weight;
    double height;
    double bmi;
    
    Person(String name){
        this.name = name;
    }
    
    Person(String name, double weight, double height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    
    void setWeightAndHeight(double weight, double height){
        this.weight = weight;
        this.height = height;
    }
    
    double calculateBMI(){
        // masa przez wzrost w metrach do kwadratu
        double h = (height/100);
        bmi = weight/(h*h);
        return bmi;
    }
    
    void displayRecord(){
        System.out.println("Name: "+name);
        System.out.println("Weight: "+weight+"kg Height: "+height+"cm");
        System.out.println("BMI: "+calculateBMI());
        if(calculateBMI()<18.5){
            System.out.println("BMI TOO LOW");
        }
        if(calculateBMI()>24.9){
            System.out.println("BMI TOO HIGH");
        }
    }
    
    public static void Main(String[] args){
        Person person1 = new Person("Szymon",70,181);
        Person person2 = new Person("Adam",6,182.5);
        
        person1.displayRecord();
        person2.displayRecord();
    }
}
