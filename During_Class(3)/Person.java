public class Person{
    
    String name;
    float weight;
    float height;
    
    Person(String name){
        this.name = name;        
    };
    
    Person(String name, float weight, float height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    };
    
    void setWeightAndHeight(float weight, float height){
        this.weight = weight;
        this.height = height;
        
    };
    
    double calculateBMI(){
        return (weight/((height/100)*(height/100)));
    };
    
    void displayInfo(){
        System.out.println(name);
        System.out.println(weight);
        System.out.println(height);
        System.out.println(calculateBMI());
        
    };
    
}


