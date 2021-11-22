public class Car{
    String company;
    String model;
    int horsePower;
    String color;
    boolean isOn;
    
    public Car(String company, String model, int horsePower, String color){
        this.company = company;
        this.model = model;
        this.horsePower = horsePower;
        this.color = color;
    }
    
    public void Drift(){
        System.out.println("The car drifts...");
    }
    
    public void turnOn(){
        this.isOn = true;
    }

    public void turnOff(){
        this.isOn = false;
    }
    
    public String toString(){
        return this.company + ", " + this.model + ", " + this.horsePower + ", " + this.color;
    }
}
