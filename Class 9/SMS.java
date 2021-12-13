public class SMS extends Message{
    
    private String phoneNumber;
    
    SMS(String text, String phoneNumber){
        super(text);
        this.phoneNumber = phoneNumber;
    }
    
    String getPhoneNumber(){
        return phoneNumber;
    }
    
    void setPhoneNumber(String newNumber){
        this.phoneNumber = newNumber;
    }
    
    void send(){
        System.out.println("Sent to: "+getPhoneNumber());
        System.out.println("Message: "+getText()+"\n");
        System.out.println(charNumber());
    }
    
    public static void main(String[] args){
        Message m1 = new SMS("Siema super jesteś","535-231-555");
        m1.getText();
        m1.charNumber();
        m1.send();
        
        Message m2 = new SMS("yoyoyo","555-312-523");
        m2.getText();
        m2.charNumber();
        m2.send();
    }
}
