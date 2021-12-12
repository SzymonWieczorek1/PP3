
public class InternetDevice
{
    String name;
    boolean connected;
    static int connectedDevices;
    
    public InternetDevice(String name){
        this.name = name;
    }
    
    void connect(){
        if (connected == false){
        connected = !connected;
        connectedDevices+=1;
    }else{
        
    }
    }
    void disconnect(){
        if (connected == true){
        connected = !connected;
    }else{
        
    }
    }
    void isConnected(){
        System.out.println("Is connected: " + connected);
    }
    void displayStatus(){
        System.out.println("Name: "+name);
        System.out.println("Connection: "+connected);
    }
    static void displayConnections(){
        System.out.println(connectedDevices);
    }
}
