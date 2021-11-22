public class Lamps{
    
    boolean on;
    
    void switchOn(){
        if( on == false){
            on = true;
        }else{
            ;
        }
    }
    void switchOff(){
        if( on == true){
            on = false;
        }else{
            ;
        }
    }    
    
    void displayInfo(){
        System.out.println("Lamp is on: "+on);
    }
}
