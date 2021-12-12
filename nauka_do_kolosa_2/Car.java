public class Car extends Vehicle{
    
    private String modelName;
    
    public Car(String modelName){
        this.modelName = modelName;
    }
    public String toString(){
        return brand + modelName;
    }
}
