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
    
    void displayRecord(){
        System.out.println(name);
        System.out.println(weight);
        System.out.println(height);
        if(calculateBMI()<18.5){
            System.out.println("BMI TOO LOW "+calculateBMI());
        }
        else if(calculateBMI()>24.9){
            System.out.println("BMI TOO HIGH "+calculateBMI());
        }
        else{
            System.out.println("BMI CORRECT "+calculateBMI());
        }
    };
    
}


