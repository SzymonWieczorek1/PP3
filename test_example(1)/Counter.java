public class Counter{
    
    private int count = 0;
    private int n;
    
    void increase(){
        count+=1;
    }
    
    void decrease(){
        count-=1;
    }
    void increase(int n){
        this.n = n;
        count+=n;
    }
    
    void decrease(int n){
        this.n = n;
        count-=n;
        
    }
    
    int value(){
        return count;
    }
}