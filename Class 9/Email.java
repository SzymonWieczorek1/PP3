public class Email extends Message{
    
    private String email;
    private String subject;
    
    Email(String text, String email, String subject){
        super(text);
        this.email = email;
        this.subject = subject;
    }
    
    String getEmail(){
        return email;
    }
    
    void setEmail(String newEmail){
        this.email = newEmail;
    }
    
    String getSubject(){
        return subject;
    }
    
    void setSubject(String newSub){
        this.subject = newSub;
    }
    
    void send(){
        System.out.println("__________________________________");
        System.out.println("Sent to: "+getEmail());
        System.out.println("Subject: "+getSubject());
        System.out.println("Message: "+getText());
        System.out.println("__________________________________");
        System.out.println(charNumber());
    }
    
    public static void main(String[] args){
        Message m1 = new Email("Eloelo","kcp.skr4@gmail.com","Muffinki");
        m1.getText();
        m1.setText("Super mufinki pozdrawiam");
        m1.charNumber();
        m1.send();
        
        Message m2 = new Email("Ale pada","ALEXsh@gmail.com","Ziemniaki");
        m2.getText();
        m2.setText("Pozdrawiam");
        m2.charNumber();
        m2.send();
    }
}