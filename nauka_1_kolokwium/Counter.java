public class Counter{
    
    int count = 0;
    
    void inc(){
        count+=1;
    }
    
    void dec(){
        count-=1;
    }
    
    void decByTen(){
        count-=10;
    }
    
    void incByTen(){
        count+=10;
    }
    
    void reset(){
        count = 0;
    }
    
    void display(){
        System.out.println(count);
    }
}
