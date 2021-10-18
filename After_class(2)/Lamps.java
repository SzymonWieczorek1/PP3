public class Lamps
{
    boolean isOn;
    
    
    void displayInfo(){
        System.out.println(isOn);
    }
    void switchOff(){
        if(isOn == true){
            isOn = !isOn;
        }
    }
    void switchOn(){
        if(isOn == false){
            isOn = !isOn;
        }
    }
}
