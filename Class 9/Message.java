abstract class Message{
    
    private String text;
    
    Message(){
        this.text ="";
    }
    
    Message(String text){
        this.text = text;
    }
    
    String getText(){
        return text;
    }
    
    void setText(String newText){
        this.text = newText;
    }
    
    int charNumber(){
        return text.length();
    }
    
    abstract void send();
}