public class Counter {
    
    int initial;
    
    
    void increaseBy10(){
        initial += 10;
    }
    void increaseBy1(){
        initial += 1;
    }
    void decreaseBy10(){
        initial -= 10;
    }
    void decreaseBy1(){
        initial -= 1;
    }
    
    void displayInfo(){
        System.out.println(initial);
    }
    
    
}
